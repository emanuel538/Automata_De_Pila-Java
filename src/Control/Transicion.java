/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Pila;

public class Transicion {
    private String operacion;
    private String simbolo;
    private String estado;
    private boolean avance;

    public Transicion(String operacion, String simbolo, String estado, boolean avance) {
        this.operacion = operacion;
        this.simbolo = simbolo;
        this.estado = estado;
        this.avance = avance;
    }

    public char operar(Pila p){
        if(simbolo.equals("")){
            p.desapilar();
            return 'S';
        }
        if(operacion.equals("apile")){
            p.apilar(simbolo.charAt(0));
            return 'S';
        }
        if(operacion.equals("out")){
            System.out.print(simbolo);
            return 'S';
        }
        p.replace(simbolo);
        return 'S';    
    }

    public String getEstado() {
        return estado;
    }

    public boolean isAvance() {
        return avance;
    }
    
}
