/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField; //Crear Un Campo De Texto


public class Utilidades {
    
    public void cargar_Archivo (JTextField txtpath, TextArea txtGeneral){
        String codigo = new String();
        JFileChooser FC = new JFileChooser(); //Instancia del File Chooser
        int result = FC.showOpenDialog(FC);
        if(result == JFileChooser.APPROVE_OPTION) {
            File Archivo = FC.getSelectedFile(); //Obtencion Del Archivo
            txtpath.setText(Archivo.getPath()); // Asigna La Ruta Al Campo De Texto
            
             try {
                     
                     FileReader r = new FileReader(Archivo.getPath()); 
                     BufferedReader leer = new BufferedReader(r);
                     String Aux = ""; // auxiliar para ver cuando la linea es vacia
                     
//                      while (Aux !=null) {
//                            Aux = buffer.readLine();
//                            if (Aux == null) {
//                                   break;
//                           }
//                     }

                        while(leer.ready()){
                                    codigo += leer.readLine() + "\n";
				}
                     
              } catch (Exception e ) {
                     JOptionPane.showMessageDialog(null, "Error Importando - " + e);
              }
             
             txtGeneral.setText(codigo);
            
        }
    }
}
