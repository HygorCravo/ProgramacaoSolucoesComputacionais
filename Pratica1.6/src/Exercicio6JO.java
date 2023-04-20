import javax.swing.JOptionPane;

public class Exercicio6JO {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Digite a temperatura em Celsius:");
        double celsius = Double.parseDouble(input);
        double fahrenheit = (celsius * 1.8) + 32;
        JOptionPane.showMessageDialog(null, String.format("%.1f graus Celsius correspondem a %.1f graus Fahrenheit.", celsius, fahrenheit));
    }
}
