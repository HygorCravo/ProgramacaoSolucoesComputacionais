import java.util.Scanner;

public class Funcao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor para x: ");
        double x = input.nextDouble();
        double resultado;
        
        if (x < -2) {
            resultado = 2*x + 2;
        } else if (x >= -2 && x < 3) {
            resultado = 0.3;
        } else {
            resultado = -x + 3*Math.exp(x);
        }
        
        System.out.println("O resultado da função para x = " + x + " é: " + resultado);
    }
}
