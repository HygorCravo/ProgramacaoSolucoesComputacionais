import java.util.Scanner;

public class Exercicio7_a {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner input = new Scanner(System.in);

        // Lendo os elementos da matriz
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = input.nextInt();
            }
        }

        // Imprimindo a matriz
        System.out.println("Matriz informada:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
