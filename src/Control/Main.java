/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Vista.General_Window; 

public class Main {

    public static void main(String[] args) {
        General_Window Gw = new General_Window();
        Gw.setLocationRelativeTo(null); // Centrar venta
        Gw.setVisible(true);  // Mostrar Ventana General
    }
}
