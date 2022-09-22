package anderson;

import javax.swing.*;

public class JantarPizza {
    public static void main (String[] args){
        var pizza = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da pizza: "));
        int pessoas = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de clientes: "));
        var valor_por_cliente = pizza/pessoas;
        JOptionPane.showMessageDialog(null, "O valor a ser pago por cada cliente é: " + valor_por_cliente);
    }
}
