import javax.swing.JOptionPane;

public class Exercicio5JO {
    public static void main(String[] args) {
        String inputMaior = JOptionPane.showInputDialog(null, "Digite a diagonal maior do losango:");
        double diagonalMaior = Double.parseDouble(inputMaior);
        String inputMenor = JOptionPane.showInputDialog(null, "Digite a diagonal menor do losango:");
        double diagonalMenor = Double.parseDouble(inputMenor);
        double area = (diagonalMaior * diagonalMenor) / 2;
        JOptionPane.showMessageDialog(null, "A área do losango é: " + String.format("%.2f", area));
    }
}
