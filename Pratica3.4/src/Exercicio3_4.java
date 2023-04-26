import java.util.Scanner;

public class Exercicio3_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int salario, totalSalarios = 0;
        int numFilhos, totalFilhos = 0;
        int numPessoas = 0;

        do {
            System.out.print("Informe o salário (ou valor negativo para encerrar): ");
            salario = scanner.nextInt();
            if (salario >= 0) {
                System.out.print("Informe o número de filhos: ");
                numFilhos = scanner.nextInt();

                totalSalarios += salario;
                totalFilhos += numFilhos;
                numPessoas++;
            }
        } while (salario >= 0);

        if (numPessoas > 0) {
            double mediaSalarios = (double) totalSalarios / numPessoas;
            double mediaFilhos = (double) totalFilhos / numPessoas;
            System.out.printf("Média salarial: R$ %.2f%n", mediaSalarios);
            System.out.printf("Média do número de filhos: %.1f%n", mediaFilhos);
        } else {
            System.out.println("Nenhum dado foi informado.");
        }

        scanner.close();
    }
}
