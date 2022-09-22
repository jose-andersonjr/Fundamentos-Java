package anderson;

import javax.swing.*;

public class Numero {
    public static void main (String[] args){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
        var sucessor = numero + 1;
        var antecessor = numero - 1;
        JOptionPane.showMessageDialog(null, "O valor do número anterior: "+antecessor+" e o valor sucessor é: " +sucessor);

    }
}
