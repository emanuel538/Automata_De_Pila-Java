package Vista;

import Control.ArchivoC;
import Control.Utilidades; // Importa Utilidades Del Controlador

public class General_Window extends javax.swing.JFrame {

    private ArchivoC archivo;

    public General_Window() {
        initComponents();
        bloquear();
        String a = "{\n"
                + "	\"Simbolos de entrada\":[\"0\", \"1\", \"&\"],\n"
                + "	\"Simbolos en la pila\":[\"0\", \"▼\"],\n"
                + "	\"Estados\":[\n"
                + "		{\n"
                + "			\"nombre\":\"S0\",\n"
                + "			\"inicial\":true,\n"
                + "			\"transiciones\":[#1,#2,R;#1,R,R]\n"
                + "		},\n"
                + "		{\n"
                + "			\"nombre\":\"S1\",\n"
                + "			\"inicial\":false,\n"
                + "			\"transiciones\":[R,#3,R;R,R,A]\n"
                + "		}\n"
                + "	],\n"
                + "	\"Configuracion inicial\":[\"▼\"],\n"
                + "	\"Transiciones\":{\n"
                + "		\"#1\":[\"apile(\"0\")\",\"permanezca\",\"avance\"],\n"
                + "		\"#2\":[\"desapile\",\"cambia S1\",\"avance\"],\n"
                + "		\"#3\":[\"desapile\",\"permanezca\",\"avance\"],\n"
                + "		\"R\":[\"Rechace\"],\n"
                + "		\"A\":[\"Acepte\"]\n"
                + "	}\n"
                + "}";
        txtGeneral.setText(a);

    }

    public void bloquear() {
        jButton1.setEnabled(false);
        jToggleButton1.setEnabled(false);
    }

    public void desbloquear() {
        jButton1.setEnabled(true);
        jToggleButton1.setEnabled(true);
    }

    //Generar Codigo
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenerar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        txtGeneral = new java.awt.TextArea();
        txtpath = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 130, 40));

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 90, 40));
        getContentPane().add(txtGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 450, 280));

        txtpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpathActionPerformed(evt);
            }
        });
        getContentPane().add(txtpath, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 340, 40));

        jButton1.setText("Ver Matriz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 140, 40));

        jButton2.setText("Interactivo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 140, 40));

        jToggleButton1.setText("Generar ilera");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 140, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Automata De Pila.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 600, 140));

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Blue.png"))); // NOI18N
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        desbloquear();
        String g = txtGeneral.getText();
        String ruta[] = g.split("\n");
        archivo = new ArchivoC(ruta);
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        Utilidades UT = new Utilidades(); //Instancia De La Clase Utilidades
        archivo = new ArchivoC(UT.cargar_Archivo(txtpath, txtGeneral)); // Ejecuat El Metodo Para Cargar El Archivo
        desbloquear();

    }//GEN-LAST:event_btnCargarActionPerformed

    private void txtpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpathActionPerformed

    }//GEN-LAST:event_txtpathActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ver_Matriz_Window mg = new Ver_Matriz_Window(archivo, this); // Declarar Matriz Generada
        mg.setVisible(true);  // Mostrar Matriz Generada
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Pila_Window p = new Pila_Window(archivo.getExpresion().getOperacion());
        p.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Interactivo_Window inte = new Interactivo_Window();
       inte.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbl_Fondo;
    private java.awt.TextArea txtGeneral;
    private javax.swing.JTextField txtpath;
    // End of variables declaration//GEN-END:variables
}
