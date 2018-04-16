package Modelo;

/*
Traduccion E Implementacion De Las Funciones De La Pila a 
los Metodos Del libro De Teoria
*/
import java.util.Map;
import java.util.Stack;

public class Pila {

    private Stack<Character> pila;
    private Map<String, String> transiciones;

    public Pila(String inicial) {
        pila = new Stack<>();
        for (int i = 0; i < inicial.length(); i++) {
            pila.push(inicial.charAt(i));
        }

    }

    //Metodo Apilar (Push)
    public void apilar(char t) {
        pila.push(t);
    }

    //Metodo Desapilar (Pop)
    public void desapilar() {
        pila.pop();
    }

    //Metodo Replace
    public void replace(String a) {
        pila.pop();
        for (int i = 0; i < a.length(); i++) {
            pila.push(a.charAt(i));
        }

    }
    
    //Metodo Toper (peek)
    public char tope(){
        return pila.peek();
    }

    public Stack<Character> getPila() {
        return pila;
    }
    
}
