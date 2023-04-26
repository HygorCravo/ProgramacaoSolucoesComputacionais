package principal;

import javax.swing.JOptionPane;

public class Exercicio4_3 {

    public static void main(String[] args) {
        String entrada;
        int numero1, numero2, soma;
        boolean continuar = true;
        
        while (continuar) {
            entrada = JOptionPane.showInputDialog("Informe o primeiro número: ");
            numero1 = validarNumero(entrada);
            entrada = JOptionPane.showInputDialog("Informe o segundo número: ");
            numero2 = validarNumero(entrada);
            
            soma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "A soma é: " + soma);
            
            entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
            if (entrada.equalsIgnoreCase("n") || entrada.equalsIgnoreCase("não")) {
                continuar = false;
            }
        }
        
        System.exit(0);
    }
    
    public static int validarNumero(String entrada) {
        int numero = 0;
        boolean valido = false;
        
        while (!valido) {
            try {
                numero = Integer.parseInt(entrada);
                valido = true;
            } catch (NumberFormatException e) {
                entrada = JOptionPane.showInputDialog("Número inválido, por favor informe novamente: ");
            }
        }
        
        return numero;
    }

}
