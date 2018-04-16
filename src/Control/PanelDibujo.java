/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author elburi
 */


import java.awt.*;
import java.util.Stack;


import javax.swing.JPanel;


public class PanelDibujo extends JPanel {
 
 public int x=150;
 public int y=250;
 public Stack<Character> pila;
 public boolean swborrar=false;
 
 public PanelDibujo(Stack<Character> p){
  pila=p;
 }
 
 public void paintComponent(Graphics g){
  super.paintComponents(g);
  Graphics2D g2d=(Graphics2D)g;
  g2d.setColor(Color.WHITE);
  g2d.fillRect(0,0,550,300);
  g2d.setColor(Color.BLACK);
  g2d.setStroke(new BasicStroke(2));
  for(int i=0;i<pila.size();i++){
   int yact=y-(i*20);
   g2d.drawRoundRect(x,y-(i*20), 100, 20, 10, 10);
   g2d.drawString(""+pila.get(i), x+45, yact+14);
  }
  
  if(swborrar){
   g2d.setColor(Color.WHITE);
   g2d.fillRect(0,0,400,200);
   pila.removeAllElements();
   swborrar=false;
  }
  
 }


 public boolean isSwborrar() {
  return swborrar;
 }


 public void setSwborrar(boolean swborrar) {
  this.swborrar = swborrar;
 }
}