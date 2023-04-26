import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        double nota = 0;
        double salario = 0;
        String sexo = "";
        int idade = 0;

        while (nota < 0 || nota > 10) {
            String entrada = JOptionPane.showInputDialog("Informe a nota: ");
            nota = Double.parseDouble(entrada);
            if (nota < 0 || nota > 10) {
                JOptionPane.showMessageDialog(null, "Nota inválida. Informe novamente.");
            }
        }

        while (salario <= 0) {
            String entrada = JOptionPane.showInputDialog("Informe o salário: ");
            salario = Double.parseDouble(entrada);
            if (salario <= 0) {
                JOptionPane.showMessageDialog(null, "Salário inválido. Informe novamente.");
            }
        }

        while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
            String entrada = JOptionPane.showInputDialog("Informe o sexo (m ou f): ");
            sexo = entrada;
            if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
                JOptionPane.showMessageDialog(null, "Sexo inválido. Informe novamente.");
            }
        }

        while (idade < 0 || idade > 150) {
            String entrada = JOptionPane.showInputDialog("Informe a idade: ");
            idade = Integer.parseInt(entrada);
            if (idade < 0 || idade > 150) {
                JOptionPane.showMessageDialog(null, "Idade inválida. Informe novamente.");
            }
        }

        JOptionPane.showMessageDialog(null, "Dados informados corretamente!");
    }
}
