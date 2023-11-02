package udemy.poo.inicio;

import javax.swing.*;
/*
    Tablas de multiplicar del 1 al 10, el numero lo proporciona el usuario
 */
public class CicloWhile {
  public static void main(String[] args) {
    String dato = JOptionPane.showInputDialog(null, "Ingrese un número para mostrar la tabla de multiplicar: "), cadena = "";
    int numUno = Integer.parseInt(dato), multiplo = 1;
    while (multiplo <= 10) {
      cadena = cadena + numUno + " x " + multiplo + " = " + (numUno * multiplo) + "\n";
      multiplo += 1;
      System.out.println(multiplo);
    }
    JOptionPane.showMessageDialog(null, cadena);
  }
}
