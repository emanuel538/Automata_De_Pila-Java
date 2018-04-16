/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Estado;
import Modelo.Operacion;

/**
 *
 * @author elburi
 */
public class ExpresionArchivoC {

    private Operacion operacion;
    private String simboloEntrada;
    private String simboloPila;

    public ExpresionArchivoC() {
        operacion = new Operacion();

    }

    void agregarSimboloEntrada(String cadena) {
        cadena = cadena.replace("]", "");
        cadena = cadena.replace(",", "");
        cadena = cadena.replace("\"", "");
        simboloEntrada = cadena;
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
            operacion.anadirSimboloEntrada(cadena.charAt(i), i);
        }

    }

    void agregarSimboloPila(String cadena) {
        cadena = cadena.replace("]", "");
        cadena = cadena.replace(",", "");
        cadena = cadena.replace("\"", "");
        simboloPila = cadena;
        for (int i = 0; i < cadena.length(); i++) {
            operacion.anadirSimboloPila(cadena.charAt(i), i);
        }
        

    }

    void agregarEstado(String nombre, String tansicion) {
        tansicion = tansicion.replace("[", "");
        tansicion = tansicion.replace("]", "");
        tansicion = tansicion.replace(";", ",");
        nombre = nombre.replace(",", "");
        String transiciones[] = tansicion.split(",");
        Estado e;
        e = new Estado(nombre, transiciones);
        operacion.agregarEstado(e);
    }

    void agregarInicial(String simbolo) {
        simbolo = simbolo.replace("[", "");
        simbolo = simbolo.replace("]", "");
        simbolo = simbolo.replace("\"", "");
        simbolo = simbolo.replace(",", "");
        operacion.setInicial(simbolo);

    }

    void agregarTransicion(String transicion[]) {
        boolean bandera;
        bandera = false;
        transicion[0] = transicion[0].replace("\"", "");
        if(transicion[0].equals("R") || transicion[0].equals("A")){
            return;
        }
        transicion[1] = transicion[1].replace("\"", "");
        transicion[1] = transicion[1].replace("]", "");
        transicion[1] = transicion[1].replace("[", "");
        String operaciones [] = transicion[1].split(",");
        String op [] = operaciones[0].split("\\(");
        String simbolo;
        simbolo = "";
        if(op.length > 1){
            simbolo = op[1].replace(")", "");
        }
        if(!operaciones[1].equals("permanezca")){
            operaciones[1] = operaciones[1].replaceAll("cambia", "");
        }
        if(operaciones[2].equalsIgnoreCase("avance")){
            bandera = true;
        }
        Transicion t = new Transicion(op[0], simbolo, operaciones[1], bandera);
        operacion.anadirTransicion(transicion[0], t);
        System.out.println(transicion[0]);        

    }

    public String getSimboloEntrada() {
        return simboloEntrada;
    }

    public void setSimboloEntrada(String simboloEntrada) {
        this.simboloEntrada = simboloEntrada;
    }

    public String getSimboloPila() {
        return simboloPila;
    }

    public void setSimboloPila(String simboloPila) {
        this.simboloPila = simboloPila;
    }

    public Operacion getOperacion() {
        return operacion;
    }
    



}
