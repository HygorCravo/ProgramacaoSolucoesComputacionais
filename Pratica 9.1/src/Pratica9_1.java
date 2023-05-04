import java.util.Scanner;

public class Pratica9_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = input.nextInt();
        }

        while (true) {
            System.out.println("\nDigite o número a ser pesquisado:");
            int numero = input.nextInt();

            System.out.println("Digite 1 para realizar a busca sequencial ou 2 para realizar a busca sequencial com sentinela:");
            int opcao = input.nextInt();

            int posicao = -1;
            int comparacoes = 0;

            switch (opcao) {
                case 1:
                    for (int i = 0; i < vetor.length; i++) {
                        comparacoes++;
                        if (vetor[i] == numero) {
                            posicao = i;
                            break;
                        }
                    }
                    break;
                case 2:
                    int ultimo = vetor[vetor.length-1];
                    vetor[vetor.length-1] = numero;

                    int i = 0;
                    while (vetor[i] != numero) {
                        comparacoes++;
                        i++;
                    }

                    vetor[vetor.length-1] = ultimo;

                    if (i < vetor.length-1 || vetor[vetor.length-1] == numero) {
                        posicao = i;
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            if (posicao == -1) {
                System.out.println("\nO número " + numero + " não foi encontrado!");
            } else {
                System.out.println("\nO número " + numero + " foi encontrado na posição " + posicao + " do vetor!");
            }

            System.out.println("Número de comparações realizadas: " + comparacoes);
        }
    }
}
