package udemy.poo.inicio;

import javax.swing.*;
/*
    Tablas de multiplicar del 1 al 10, el numero lo proporciona el usuario
 */
public class CicloFor {
  public static void main(String[] args) {
    String dato = JOptionPane.showInputDialog(null, "Ingrese un número para mostrar la tabla de multiplicar: "), cadena = "";
    float datoNum = Float.parseFloat(dato);
    int ayuda = 0;

    for (ayuda = 1; ayuda <= 10; ayuda++) {
      cadena = cadena + datoNum + " x " + ayuda + " = " + (datoNum * ayuda) + "\n";
    }
    JOptionPane.showMessageDialog(null, cadena);
  }
}
