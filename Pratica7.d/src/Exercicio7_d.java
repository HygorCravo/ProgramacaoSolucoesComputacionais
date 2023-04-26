import java.util.Scanner;

public class Exercicio7_d {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner input = new Scanner(System.in);

        // Lendo os elementos da matriz
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = input.nextInt();
            }
        }

        // Aqui Troca os elementos da diagonal principal com os da diagonal secundária
        int temp;
        for (int i = 0, j = 4; i < 5; i++, j--) {
            temp = matriz[i][i];
            matriz[i][i] = matriz[i][j];
            matriz[i][j] = temp;
        }

        // Imprime a matriz resultante
        System.out.println("Matriz resultante:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
