package Control;

import Modelo.Estado;
import Modelo.Operacion;
import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField; //Crear Un Campo De Texto
import javax.swing.table.DefaultTableModel;


public class Utilidades {
    
    // Funcion Para Cargar Un Archivo De Texto A un Text_Area
    public String cargar_Archivo (JTextField txtpath, TextArea txtGeneral){
        String ruta;
        ruta = "";
        String textoPila = new String(); // Variable Donde Se Guarda El Texto De La Pila
        JFileChooser FC = new JFileChooser(); //Instancia del File Chooser
        int result = FC.showOpenDialog(FC);
        if(result == JFileChooser.APPROVE_OPTION) {
            File Archivo = FC.getSelectedFile(); //Obtencion Del Archivo
            ruta = Archivo.getPath();
            txtpath.setText(ruta); // Asigna La Ruta Al Campo De Texto
             
             try {
                     
                     FileReader r = new FileReader(Archivo.getPath()); 
                     BufferedReader leer = new BufferedReader(r);
                        while(leer.ready()){ // Lee Hasta Que El Campo De Texto Este Vacio
                                    textoPila += (leer.readLine() + "\n") ;
				}
              } catch (Exception e ) {
                     JOptionPane.showMessageDialog(null, "Error Importando - " + e);
              }
             txtGeneral.setText(textoPila); // Asignacion Del Texto al Txt_Area
        }
        return ruta;
    }
    
    public void generarCombobox(JComboBox estado,ArchivoC archivo){
        ExpresionArchivoC expresion = archivo.getExpresion();
        Operacion operacion = expresion.getOperacion();
        ArrayList <Estado> e = operacion.getEstados();
        for(Estado est : e){
            estado.addItem(est.getNombre());
        }
        
    }
    public void  generarTabla(DefaultTableModel modelo, ArchivoC c,String estado){
        Estado est;
        est = null;
        ExpresionArchivoC expresion = c.getExpresion();
        String entrada = expresion.getSimboloEntrada();
        String pila = expresion.getSimboloPila();
        String transicion [] = new String[entrada.length()];
        Operacion p = expresion.getOperacion();
        int pos;
        ArrayList <Estado>estados = p.getEstados();
        for(Estado e : estados){
            est = e;
            System.out.println(e.getNombre());
            System.out.println(estado);
            if(e.getNombre().equals(estado)){
                break;
            }
        }
        for(int i = 0; i < pila.length();i++){
            for(int j = 0; j < entrada.length();j++){
                transicion[j] = est.getTransicion()[p.calcularposArreglo(entrada.charAt(j),pila.charAt(i))];
            }
            modelo.addRow(transicion);
        }
        
        
    }
    
}
