package anderson;

import javax.swing.*;
import java.util.Scanner;

public class LeituraEscrita {
    public static void main ( String[] args) {

        // Recebendo e mostrando valores no terminal
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite o seu nome: ");
//        var nome = teclado.next();
//        System.out.println("Seja bem-vindo: " + nome);

        // No código acima o Scanner não lê nomes separados por espaço
        var nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        JOptionPane.showMessageDialog(null,"Seja bem-vindo: " + nome);
    }
}
