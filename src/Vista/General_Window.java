package Vista;

import Controlador.Utilidades; // Importa Utilidades Del Controlador

public class General_Window extends javax.swing.JFrame {
    
    public General_Window() {
        initComponents();
    }

    //Generar Codigo
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFoto = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        txtGeneral = new java.awt.TextArea();
        txtpath = new javax.swing.JTextField();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFoto.setText("Foto");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 90, 40));

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

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Blue.png"))); // NOI18N
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 750, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed

    }//GEN-LAST:event_btnFotoActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        Utilidades UT = new Utilidades(); //Instancia De La Clase Utilidades
        UT.cargar_Archivo(txtpath, txtGeneral); // Ejecuat El Metodo Para Cargar El Archivo
    }//GEN-LAST:event_btnCargarActionPerformed

    private void txtpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpathActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnFoto;
    private javax.swing.JLabel lbl_Fondo;
    private java.awt.TextArea txtGeneral;
    private javax.swing.JTextField txtpath;
    // End of variables declaration//GEN-END:variables
}
