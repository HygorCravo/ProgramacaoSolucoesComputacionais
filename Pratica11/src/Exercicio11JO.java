import javax.swing.JOptionPane;

public class Exercicio11JO {
  public static void main(String[] args) {
    // solicita o número ao usuário
    String inputNumero = JOptionPane.showInputDialog("Digite um número:");

    // converte a string de entrada para um número inteiro
    int numero = Integer.parseInt(inputNumero);

    // exibe a tabuada de multiplicação do número
    String resultado = "";
    for (int i = 1; i <= 10; i++) {
      resultado += numero + " x " + i + " = " + (numero * i) + "\n";
    }
    JOptionPane.showMessageDialog(null, resultado);
  }
}
