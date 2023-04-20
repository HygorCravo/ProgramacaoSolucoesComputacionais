import javax.swing.JOptionPane;

public class Exercicio8JO {
    public static void main(String[] args) {
        String pesoStr = JOptionPane.showInputDialog(null, "Digite o peso da pessoa:");
        double peso = Double.parseDouble(pesoStr);
        
        double novoPesoAumento = peso * 1.15;
        double novoPesoReducao = peso * 0.8;
        
        JOptionPane.showMessageDialog(null, "Se a pessoa engordar 15%, o novo peso será " + String.format("%.2f", novoPesoAumento));
        JOptionPane.showMessageDialog(null, "Se a pessoa emagrecer 20%, o novo peso será " + String.format("%.2f", novoPesoReducao));
    }
}
