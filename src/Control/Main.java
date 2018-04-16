/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Vista.General_Window; // Importar Vista

public class Main {
    public static void main(String[] args) {
     General_Window  gw = new General_Window(); // Declarar Ventana General
     gw.setLocationRelativeTo(null); // Centrar ventana general
     gw.setVisible(true);  // Mostrar Ventana General
    }
}
