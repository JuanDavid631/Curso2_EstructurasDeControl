package udemy.poo.inicio;

import javax.swing.*;
/*
    Recibir numero por graficos, evaluar si el numero es par o impar, mostrar el resultado en grafico.
 */
public class CicloElseIf {
  public static void main(String[] args) {
    String dato = JOptionPane.showInputDialog(null, "Ingrese un número positivo: ");
    String par = "";
    int numUno = Integer.parseInt(dato);
    if (numUno % 2 == 0) {
      par = par + "El numero " + numUno + " es par";
    } else {
      par = par + "El numero " + numUno + " es impar";
    }
    JOptionPane.showMessageDialog(null, par, "¿Qué número es?", JOptionPane.INFORMATION_MESSAGE);
  }
}
