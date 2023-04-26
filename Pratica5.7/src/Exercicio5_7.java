import java.util.Scanner;

public class Exercicio5_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o " + i + "º número: ");
            int num = input.nextInt();

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("O maior número informado é: " + maior);
        System.out.println("O menor número informado é: " + menor);
    }
}
