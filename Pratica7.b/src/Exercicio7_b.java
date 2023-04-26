import java.util.Scanner;

public class Exercicio7_b {
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

        // Imprimindo os elementos nas posições em que o índice da linha é par e o índice da coluna é ímpar
        System.out.println("Elementos nas posições em que o índice da linha é par e o índice da coluna é ímpar:");
        for (int i = 0; i < matriz.length; i += 2) {
            for (int j = 1; j < matriz[i].length; j += 2) {
                if (i % 2 == 0 && j % 2 == 1) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }
}
