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

  }
}
