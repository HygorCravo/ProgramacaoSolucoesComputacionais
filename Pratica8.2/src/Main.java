import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        // Loop para ler o números até que sejam válidos
        while (true) {
            try {
                System.out.print("Digite o primeiro número: ");
                num1 = input.nextInt();
                System.out.print("Digite o segundo número: ");
                num2 = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, digite um número inteiro.");
                input.nextLine(); // Descarta a entrada inválida
            }
        }

        try {
            int resultado = Dividir.dividir(num1, num2);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
