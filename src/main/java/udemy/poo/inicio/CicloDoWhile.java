package udemy.poo.inicio;

import javax.swing.*;
/*
    Tablas de multiplicar del 1 al 10, el numero lo proporciona el usuario
 */
public class CicloDoWhile {
  public static void main(String[] args) {
    String dato = JOptionPane.showInputDialog(null, "Ingrese un numero: "), cadena = "";
    int numUno = Integer.parseInt(dato), multiplo = 1;
    do {
      cadena = cadena + numUno + " x " + multiplo + " = " + (numUno * multiplo) + "\n";
      multiplo++;
    } while (multiplo <= 10);
    JOptionPane.showMessageDialog(null, cadena);
  }
}
