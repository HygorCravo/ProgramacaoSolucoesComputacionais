import javax.swing.JOptionPane;

public class Exercicio7JO {
    public static void main(String[] args) {
        String salarioMinimoStr = JOptionPane.showInputDialog("Digite o valor do salário mínimo:");
        double salarioMinimo = Double.parseDouble(salarioMinimoStr);
        
        String salarioFuncionarioStr = JOptionPane.showInputDialog("Digite o valor do salário do funcionário:");
        double salarioFuncionario = Double.parseDouble(salarioFuncionarioStr);
        
        double qtdSalariosMinimos = salarioFuncionario / salarioMinimo;
        JOptionPane.showMessageDialog(null, "O funcionário recebe " + String.format("%.2f", qtdSalariosMinimos) + " salários mínimos.");
    }
}
