import javax.swing.JOptionPane;

public class NotasAluno {
    public static void main(String[] args) {
        double nota1, nota2, media;
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        
        media = (nota1 + nota2) / 2;
        
        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "Aluno aprovado com média " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Aluno reprovado com média " + media);
        }
    }
}
