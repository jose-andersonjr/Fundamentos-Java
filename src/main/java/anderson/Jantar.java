package anderson;

import javax.swing.*;

public class Jantar {
    public static void main(String[] args){
        final double taxa_garcom = 0.1;
        double valor_jantar , valor_jantar_total;

        valor_jantar = Double.parseDouble(JOptionPane.showInputDialog("Informar o valor do jantar: "));
        valor_jantar_total = valor_jantar + (valor_jantar*taxa_garcom);
        JOptionPane.showMessageDialog(null, "O valor total do jantar foi: " + valor_jantar_total);

    }
}
