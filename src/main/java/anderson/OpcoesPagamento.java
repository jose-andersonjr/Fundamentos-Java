package anderson;

import javax.swing.*;

public class OpcoesPagamento {
    public static void main(String[] args){
        double valor_produto = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do produto: "));
        var valor_avista = valor_produto *0.9;
        var valor_parcela = valor_produto/3;
        JOptionPane.showMessageDialog(null, "O valor do produto a vista é " +valor_avista);
        JOptionPane.showMessageDialog(null, "O valor mensal do produto parcelado em 3x é " + valor_parcela);
    }
}
