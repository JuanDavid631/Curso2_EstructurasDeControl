package udemy.poo.inicio;

import javax.swing.*;

/*
    Recibir tres numeros y determinar cual es el mayor, el medio y el menor.
 */
public class EjercicioTresNumeros {
  public static void main(String[] args) {
    String datoUno = JOptionPane.showInputDialog(null, "Dame el número 1: "),
            datoDos = JOptionPane.showInputDialog(null, "Dame el número 2: "),
            datoTres = JOptionPane.showInputDialog(null, "Dame el número 3: ");
    int numUno = Integer.parseInt(datoUno),
        numDos = Integer.parseInt(datoDos),
        numTres = Integer.parseInt(datoTres);

    if (numUno > numDos) {
      if (numUno > numTres) {
        if (numTres > numDos){
          JOptionPane.showMessageDialog(null, "El numero mayor es: " + numUno +
              "\nEl numero medio es: " + numTres + "\nEl numero menor es: " + numDos);
        } else {
          JOptionPane.showMessageDialog(null, "El numero mayor es: " + numUno +
              "\nEl numero medio es: " + numDos + "\nEl numero menor es: " + numTres);
        }
      } else {
        JOptionPane.showMessageDialog(null, "El numero mayor es: " + numTres +
            "\nEl numero medio es: " + numUno + "\nEl numero menor es: " + numDos);
      }
    } else {
      if (numDos > numTres) {
        if (numTres > numUno) {
          JOptionPane.showMessageDialog(null, "El numero mayor es: " + numDos +
              "\nEl numero medio es: " + numTres + "\nEl numero menor es: " + numUno);
        } else {
          JOptionPane.showMessageDialog(null, "El numero mayor es: " + numDos +
              "\nEl numero medio es: " + numUno + "\nEl numero menor es: " + numTres);
        }
      } else {
        JOptionPane.showMessageDialog(null, "El numero mayor es: " + numTres +
            "\nEl numero medio es: " + numDos + "\nEl numero menor es: " + numUno);
      }
    }
  }
}
