import javax.swing.JOptionPane;

public class Exercicio9JO {
    public static void main(String[] args) {
        double cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro cateto: "));
        double cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo cateto: "));

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        JOptionPane.showMessageDialog(null, "A hipotenusa do triângulo é: " + String.format("%.2f", hipotenusa));
    }
}
