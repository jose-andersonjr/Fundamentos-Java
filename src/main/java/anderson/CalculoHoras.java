package anderson;

import javax.swing.*;

public class CalculoHoras {
    public static void main (String[] args) {
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de dias de viagem: "));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas de viagem: "));
        int total_horas = (dias*24) + horas;
        JOptionPane.showMessageDialog(null, "O número total de horas da sua viagem foi de " + total_horas + " horas");
    }
}
