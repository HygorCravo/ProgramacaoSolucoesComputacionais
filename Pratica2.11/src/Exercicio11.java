import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de diárias: ");
        int numDiarias = sc.nextInt();

        double valorDiaria = 500.0;
        double taxaServicos = 0.0;

        if (numDiarias < 15) {
            taxaServicos = 15.0;
        } else if (numDiarias == 15) {
            taxaServicos = 10.0;
        } else {
            taxaServicos = 5.0;
        }

        double total = numDiarias * valorDiaria + numDiarias * taxaServicos;

        System.out.printf("Total a ser pago: R$ %.2f", total);

        sc.close();
    }
}
