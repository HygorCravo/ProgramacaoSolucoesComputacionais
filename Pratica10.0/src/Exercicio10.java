import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio da esfera: "));

        double comprimento = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        double volume = 4.0 / 3.0 * Math.PI * Math.pow(raio, 3);

        JOptionPane.showMessageDialog(null, "Comprimento da esfera: " + String.format("%.2f", comprimento) + "\n" +
                                            "Área da esfera: " + String.format("%.2f", area) + "\n" +
                                            "Volume da esfera: " + String.format("%.2f", volume));
    }
}
