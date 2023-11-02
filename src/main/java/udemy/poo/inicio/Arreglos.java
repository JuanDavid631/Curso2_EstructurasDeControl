package udemy.poo.inicio;

import javax.swing.*;

public class Arreglos {
  public static void main(String[] args) {
    String[] arreglo = {"Norte", "Sur", "Este", "Oeste"};
    int[][] arrDos = {{1, 2, 3}, {4, 5}};
    int[] arrTres = new int[10];
    String cad = "";

    for (int i = 0; i < arreglo.length; i++) {
      cad = cad + arreglo[i] + "\n";
    }

    JOptionPane.showMessageDialog(null, cad);

    for (int i = 0; i < arrDos.length; i++) {
      for (int j = 0; j < arrDos[i].length; j++) {
        cad = cad + arrDos[i][j] + " ";
      }
    }

    JOptionPane.showMessageDialog(null, cad);

    for (int i = 0; i < arrTres.length; i++) {
      cad = cad + arrTres[i] + " ";
    }

    JOptionPane.showMessageDialog(null, cad);
  }
}
