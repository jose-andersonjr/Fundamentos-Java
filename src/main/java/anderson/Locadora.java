package anderson;

import javax.swing.*;

public class Locadora {
    public static void main(String[] args) {
        var titulo_filme = JOptionPane.showInputDialog("Insira o título do filme: ");
        var duracao_filme_horas = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas do filme: "));
        int duracao_filme_minutos = Integer.parseInt(JOptionPane.showInputDialog("Digte os minutos do filme: "));
        int nova_duracao = duracao_filme_horas*60 + duracao_filme_minutos;
        JOptionPane.showMessageDialog(null, "A duração total do "+ titulo_filme +" em minutos é de " + nova_duracao + " minutos");
    }
}
