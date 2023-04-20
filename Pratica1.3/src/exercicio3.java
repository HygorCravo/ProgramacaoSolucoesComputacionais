import javax.swing.JOptionPane;

public class exercicio3 {
    public static void main(String[] args) {
        double cotacaoDolar = 5.01; // cotação do dólar em reais
        double valorDolar = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em dólares:"));
        double valorReal = valorDolar * cotacaoDolar;
        JOptionPane.showMessageDialog(null, "O valor em reais é: R$" + String.format("%.2f", valorReal));
    }
}
