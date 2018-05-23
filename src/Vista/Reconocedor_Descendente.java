/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ArchivoC;
import Control.Utilidades;


public class Reconocedor_Descendente extends javax.swing.JFrame {
    private ArchivoC archivo; // Creacion Del Archivo

    public Reconocedor_Descendente() {
        initComponents();
        bloquear();
        String a = "1. A = aC\n"
                +  "2. A = bBc\n"
                +  "3. B = aA\n"
                +  "4. B = bB\n"
                +  "5. C = aCa\n"
                +  "6. C = bBcc\n"
                +  "7. C = |\n";
        txtGeneral.setText(a);
    }
    
    public void bloquear() {
        //btnVerMatriz.setEnabled(false);
        //btnGenerarHilera.setEnabled(false);
    }

    public void desbloquear() {
        //btnVerMatriz.setEnabled(true);
        //btnGenerarHilera.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Name = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        txtGeneral = new java.awt.TextArea();
        txtpath = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Reconocedor Descendente.png"))); // NOI18N
        getContentPane().add(lbl_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 780, 150));

        jToggleButton1.setText("Cargar");
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 110, 30));
        getContentPane().add(txtGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 500, 270));

        txtpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpathActionPerformed(evt);
            }
        });
        getContentPane().add(txtpath, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 370, 30));

        jToggleButton2.setText("Interactivo");
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 120, 50));

        jToggleButton3.setText("Generar  Matriz");
        getContentPane().add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, -1, 50));

        jToggleButton4.setText("Secuencia");
        getContentPane().add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 120, 50));

        jToggleButton5.setText("Generar");
        getContentPane().add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 110, 50));

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Blue.png"))); // NOI18N
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpathActionPerformed
        Utilidades UT = new Utilidades(); //Instancia De La Clase Utilidades
        archivo = new ArchivoC(UT.cargar_Archivo(txtpath, txtGeneral)); // Ejecuat El Metodo Para Cargar El Archivo
        desbloquear();
    }//GEN-LAST:event_txtpathActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_Name;
    private java.awt.TextArea txtGeneral;
    private javax.swing.JTextField txtpath;
    // End of variables declaration//GEN-END:variables
}
