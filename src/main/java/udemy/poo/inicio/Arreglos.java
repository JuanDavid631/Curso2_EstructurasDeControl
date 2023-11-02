package udemy.poo.inicio;

import javax.swing.*;

public class Arreglos {
  public static void main(String[] args) {
    String[] arreglo = {"Norte", "Sur", "Este", "Oeste"};
    int[][] arregloDos = {{1, 2, 3}, {4, 5}};
    int[] arregloTres = new int[10];
    String cadena = "";
    int ayuda = 0, help = 0;

    for (ayuda = 0; ayuda < arreglo.length; ayuda++) {
      cadena = cadena + arreglo[ayuda] + "\n";
    }
    JOptionPane.showMessageDialog(null, cadena);

    for (ayuda = 0; ayuda < arregloDos.length; ayuda++) {
      for (help = 0; help < arregloDos[ayuda].length; help++) {
        cadena = cadena + arregloDos[ayuda][help] + " ";
      }
    }
    JOptionPane.showMessageDialog(null, cadena);

    for (ayuda = 0; ayuda < arregloTres.length; ayuda++) {
      cadena = cadena + arregloTres[ayuda] + " ";
    }
    JOptionPane.showMessageDialog(null, cadena);
  }
}
