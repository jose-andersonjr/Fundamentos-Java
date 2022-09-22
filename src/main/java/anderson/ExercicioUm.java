package anderson;

import javax.swing.*;

public class ExercicioUm {
    public static void main(String[] args) {
        float valor_jantar, valor_jantar_total;

        valor_jantar = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do jantar: "));
        Object[] taxasPossiveis = {15, 18, 22};
        float taxaEscolhida = (Float) JOptionPane.showInputDialog(null,
                "Escolha o valor da taxa do garçom: ", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                taxasPossiveis, taxasPossiveis[0]);
        valor_jantar_total = valor_jantar +((taxaEscolhida/100)*valor_jantar);
        JOptionPane.showMessageDialog(null,"O valor do total do jantar foi R$" + valor_jantar_total);

    }
}