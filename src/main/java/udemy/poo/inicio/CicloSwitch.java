package udemy.poo.inicio;

import javax.swing.*;

/*
  Programa que reciba por grafico un número y este número sea mayor a 1 y menor a 7 el cual de un resultado de la semana
 */
public class CicloSwitch {
  public static void main(String[] args) {
    String dato = JOptionPane.showInputDialog(null, "Dame un día de la semana: ");
    String dia = "";
    int numUno = Integer.parseInt(dato);
    switch (numUno) {
      case 1: dia = "El día es Lunes";
      break;
      case 2: dia = "El día es Martes";
      break;
      case 3: dia = "El día es Miércoles";
      break;
      case 4: dia = "El día es Jueves";
      break;
      case 5: dia = "El día es Viernes";
      break;
      case 6: dia = "El día es Sábado";
      break;
      default: dia = "El día es Domingo";
      break;
    }
    JOptionPane.showMessageDialog(null, dia);
  }
}
