import javax.swing.JOptionPane;

public class exercicio1b {
    public static void main(String[] args) {
        String avalicao1String = JOptionPane.showInputDialog("Digite a primeira nota:");
        double nota1 = Double.parseDouble(avalicao1String);
        
        String avaliacao2String = JOptionPane.showInputDialog("Digite a segunda nota:");
        double nota2 = Double.parseDouble(avaliacao2String);
        
        String avaliacao3String = JOptionPane.showInputDialog("Digite a terceira nota:");
        double nota3 = Double.parseDouble(avaliacao3String);
        
        double media = (nota1 + nota2 + nota3) / 3;
        JOptionPane.showMessageDialog(null, "A média aritmética das notas é: " + media);
    }
}
