import java.util.Scanner;

public class Exercicio5_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = input.nextInt();
        System.out.println("Os números ímpares entre 1 e " + n + " são:");
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
