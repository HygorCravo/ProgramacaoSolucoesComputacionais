import java.util.Scanner;

public class Exercicio7_c {
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

        // Criando a matriz transposta
        int[][] transposta = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }

        // Imprimindo a matriz transposta
        System.out.println("Matriz transposta:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
