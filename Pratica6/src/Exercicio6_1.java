import java.util.Scanner;

public class Exercicio6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        int somaPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = sc.nextInt();

            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
            }
        }

        System.out.print("Vetor digitado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\nSoma dos números pares: " + somaPares);

        sc.close();
    }
}
