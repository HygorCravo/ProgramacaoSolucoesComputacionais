import java.util.Scanner;

public class Exercicio6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        System.out.println("Digite 10 números reais: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("Números informados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nMenor número informado: " + menor);
        System.out.println("Maior número informado: " + maior);

        sc.close();
    }
}
