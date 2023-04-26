import java.util.Scanner;

public class Exercicio6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] vetor = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = input.nextDouble();
        }
        
        System.out.print("Os elementos nas posições pares do vetor são: ");
        for (int i = 0; i < 10; i += 2) {
            System.out.print(vetor[i] + " ");
        }
    }
}
