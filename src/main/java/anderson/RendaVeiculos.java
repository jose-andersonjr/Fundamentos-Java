package anderson;

import javax.swing.*;
// receber o modelo de um carro, receber o valor total, mostrar o valor de 12 parcelas apos uma entrada de 50% do valor1
public class RendaVeiculos {
    public static void main(String[] args){
        var modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
        double preco_carro = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor total do carro: "));
        double valor_entrada = preco_carro*0.5;
        double valor_parcela = valor_entrada/12;
        JOptionPane.showMessageDialog(null, "Após uma entrada de "+valor_entrada+" você pode pagar o restante com 12 parcelas de "+valor_parcela);

    }
}
