import java.util.Arrays;
import java.util.Scanner;

public class Pratica9_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        // Leitura
        System.out.println("Digite os 10 números do vetor em ordem crescente:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
        Arrays.sort(vetor);

        // Faz a Busca
        int numero;
        do {
            System.out.println("\nDigite o número a ser pesquisado (ou -1 para sair):");
            numero = sc.nextInt();
            if (numero != -1) {
                int posicao = buscaBinaria(vetor, numero);
                int comparacoes = posicao + 1; // número de comparações é a posição do número na busca binária + 1
                if (posicao == -1) {
                    System.out.println("Número não encontrado.");
                } else {
                    System.out.println("Número encontrado na posição " + posicao + ".");
                }
                System.out.println("Número de comparações: " + comparacoes);
            }
        } while (numero != -1);

        sc.close();
    }

    // Implementação da busca
    public static int buscaBinaria(int[] vetor, int numero) {
        int esquerda = 0;
        int direita = vetor.length - 1;
        int meio;

        while (esquerda <= direita) {
            meio = (esquerda + direita) / 2;
            if (vetor[meio] == numero) {
                return meio;
            } else if (vetor[meio] < numero) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1;
    }
}
