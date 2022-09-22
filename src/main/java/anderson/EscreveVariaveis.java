package anderson;

import javax.swing.*;

public class EscreveVariaveis {
    public static void main (String[] args) {
        // Sem receber valores
//        String fruta = "Banana";
//        double valor = 3.50;
//        System.out.println("O valor da "+ fruta +" é " + valor);

        // Recebendo valores pelo JOptionPane
        var valor = 3.5;
        var fruta = JOptionPane.showInputDialog("Digite a fruta: ");
        JOptionPane.showMessageDialog(null, "O valor da " + fruta + " é: " + valor);
    }

}
