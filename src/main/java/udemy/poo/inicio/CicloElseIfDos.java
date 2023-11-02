package udemy.poo.inicio;

import javax.swing.*;
/*
    Recibir numero por graficos, evaluar si el numero es igual o no a ciertos criterios que se proporcionan.
 */
public class CicloElseIfDos {
  public static void main(String[] args) {
    String dato = JOptionPane.showInputDialog(null, "Dame un número");
    int numUno = Integer.parseInt(dato);
    String igual = "";
    if (numUno == 10){
      igual = igual + " El número es igual a 10";
    } else if (numUno == 20) {
      igual = igual + " El número es igual a 20";
    } else if (numUno == 30) {
      igual = igual + " El número es igual a 30";
    } else {
      igual = igual + " El número no está dentro del rango permitido";
    }
    JOptionPane.showMessageDialog(null, igual);
  }
}
