package Vista;

/*
Ventana Interactiva que muestra el manejo de la pila y sus iteracciones
*/


import Control.PanelDibujo;
import Control.ProcesarIleraC;
import Modelo.Operacion;
import Modelo.Pila;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Pila_Window extends JFrame {

    PanelDibujo panel;
    JPanel pdatos;
    JTextField t;
    private JButton borrar;
    private JButton b;
    private Pila pila;
    private int pos;
    private String ilera;
    private ProcesarIleraC procesar;
    private Pila_Window pila_Window;

    public Pila_Window(Operacion p) {
        pila_Window = this;
        procesar = new ProcesarIleraC(p.getEstados().get(0));
        ilera = "";
        pos = 0;
        pdatos = new JPanel();
        this.setSize(400, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        t = new JTextField(10);
        b = new JButton("Comenzar");
        pila = new Pila(p.getInicial());
        panel = new PanelDibujo(pila.getPila());
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ilera = t.getText();
                borrar.setEnabled(true);
                b.setEnabled(false);

            }

        });

        borrar = new JButton("Siguiente");
        borrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                char t;
                t = ' ';
                if (pos < ilera.length()) {
                    t = procesar.procesarIlera(pila, p, ilera.charAt(pos), pila_Window);
                    panel.repaint();
                    repaint();
                } else {
                    t = procesar.procesarIlera(pila, p, '&', pila_Window);
                }
                if (t == 'R' || t == 'A') {
                    JOptionPane.showMessageDialog(null, "Termina el reconocimiento y es igual a " + t);
                    dispose();
                }

            }
        });

        pdatos.add(new JLabel("Valor: "));
        pdatos.add(t);
        pdatos.add(b);
        pdatos.add(borrar);
        borrar.setEnabled(false);

        add(panel);
        add(pdatos, BorderLayout.SOUTH);

    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

}
