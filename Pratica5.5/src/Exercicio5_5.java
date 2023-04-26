import java.util.Scanner;

public class Exercicio5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        char choice;

        do {
            System.out.print("Digite um número inteiro: ");
            num = input.nextInt();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }

            System.out.print("Deseja digitar outro número? (S/N): ");
            choice = input.next().charAt(0);
        } while (choice == 'S' || choice == 's');

        System.out.println("Maior número: " + max);
        System.out.println("Menor número: " + min);
    }
}
