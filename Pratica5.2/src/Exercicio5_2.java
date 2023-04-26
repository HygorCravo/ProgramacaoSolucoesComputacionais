import java.util.Scanner;

public class Exercicio5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        for (int i = inicio + 1; i < fim; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        sc.close();
    }
}
