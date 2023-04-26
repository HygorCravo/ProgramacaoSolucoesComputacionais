import java.util.Scanner;

public class Exercicio6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextDouble();
        }
        
        System.out.print("Vetor: ");
        for (double num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.print("Posições com números negativos: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.print(i + " ");
            }
        }
    }
}
