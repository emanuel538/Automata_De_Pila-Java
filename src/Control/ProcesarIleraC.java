/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Estado;
import Modelo.Operacion;
import Modelo.Pila;
import Vista.Pila_Window;
import java.util.ArrayList;

/**
 *
 * @author elburi
 */
public class ProcesarIleraC {

    private Estado e;
    private ArrayList<Estado> estados;

    public ProcesarIleraC(Estado e) {
        this.e = e;
    }

    public char procesarIlera(Pila pila, Operacion o, char caracter, Pila_Window p) {
        int pos = o.calcularposArreglo(caracter, pila.tope());
        String trancicion = e.getTransicion()[pos];
        if(trancicion.equalsIgnoreCase("A") || trancicion.equalsIgnoreCase("R")){
            if(trancicion.equalsIgnoreCase("A")){
                return 'A';
            }
            else{
                return 'R';
            }
        
        }
        Transicion t = o.getTransicion(trancicion);
        if (!t.getEstado().equals("permanezca")) {
            estados = o.getEstados();
            for (Estado u : estados) {
                if (t.getEstado().equals(u.getNombre())) {
                    e = u;
                    break;
                }
            }
        }
        if (t.isAvance()) {
            p.setPos((p.getPos() + 1));
        }
        return t.operar(pila);

    }

}
