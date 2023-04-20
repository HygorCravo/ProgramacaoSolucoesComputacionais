import javax.swing.JOptionPane;

public class Exercicio4JO {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Digite o salário atual do funcionário:");
        double salarioAtual = Double.parseDouble(input);
        double novoSalario = salarioAtual * 1.25; // aumento de 25%
        JOptionPane.showMessageDialog(null, "O novo salário do funcionário é: R$" + String.format("%.2f", novoSalario));
    }
}
