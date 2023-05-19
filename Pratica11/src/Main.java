import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ordenacao ordenacao = new Ordenacao();
        int[] vetor = new int[10];

        // Executa quantas vezes o usuário quiser
        boolean executar = true;
        while (executar) {
            System.out.println("Escolha o método de ordenação:");
            System.out.println("1 - Bolha");
            System.out.println("2 - Seleção");
            System.out.println("3 - Inserção");
            System.out.println("4 - Quicksort");
            System.out.println("5 - Merge Sort");
            System.out.println("6 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe 10 números para serem ordenados:");
                    for (int i = 0; i < 10; i++) {
                        vetor[i] = scanner.nextInt();
                    }
                    ordenacao.bubbleSort(vetor);
                    System.out.println("Vetor ordenado:");
                    for (int num : vetor) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Informe 10 números para serem ordenados:");
                    for (int i = 0; i < 10; i++) {
                        vetor[i] = scanner.nextInt();
                    }
                    ordenacao.selectionSort(vetor);
                    System.out.println("Vetor ordenado:");
                    for (int num : vetor) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Informe 10 números para serem ordenados:");
                    for (int i = 0; i < 10; i++) {
                        vetor[i] = scanner.nextInt();
                    }
                    ordenacao.insertionSort(vetor);
                    System.out.println("Vetor ordenado:");
                    for (int num : vetor) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Informe 10 números para serem ordenados:");
                    for (int i = 0; i < 10; i++) {
                        vetor[i] = scanner.nextInt();
                    }
                    ordenacao.quickSort(vetor, 0, vetor.length - 1);
                    System.out.println("Vetor ordenado:");
                    for (int num : vetor) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Informe 10 números para serem ordenados:");
                    for (int i = 0; i < 10; i++) {
                        vetor[i] = scanner.nextInt();
                    }
                    ordenacao.mergeSort(vetor, 0, vetor.length - 1);
                    System.out.println("Vetor ordenado:");
                    for (int num : vetor) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 6:
                    executar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
