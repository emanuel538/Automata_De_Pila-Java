/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.Transicion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author elburi
 */
public class Operacion {

    private Map<Character, Integer> simbolosEntrada;
    private Map<Character, Integer> simbolosPila;
    private ArrayList<Estado> estados;
    private String inicial;
    private Map<String, Transicion> transicion;

    public Operacion() {
        simbolosEntrada = new HashMap<>();
        simbolosPila = new HashMap<>();
        estados = new ArrayList<>();
        inicial = "";
        transicion = new HashMap<>();

    }

    public void anadirSimboloEntrada(char t, int i) {
        simbolosEntrada.put(t, i);
    }

    public void anadirSimboloPila(char t, int i) {
        simbolosPila.put(t, i);
    }

    public void anadirTransicion(String clave, Transicion t) {
        transicion.put(clave, t);
    }
    public Transicion getTransicion(String t){
        return transicion.get(t);
    }

    public int calcularposArreglo(char entrada, char pila) {
        int pos;
        pos = simbolosEntrada.size() * simbolosPila.get(pila) + simbolosEntrada.get(entrada);
        return pos;
    }

    public void agregarEstado(Estado e) {
        estados.add(e);
    }

    
    public void setInicial(String inicial) {
        this.inicial = inicial;
    }

    public ArrayList<Estado> getEstados() {
        return estados;
    }

    public String getInicial() {
        return inicial;
    }
    
    

}
