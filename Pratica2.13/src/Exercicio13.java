import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo de apartamento (S para simples e D para duplo): ");
        String tipo = sc.nextLine();

        System.out.print("Digite a quantidade de dias de hospedagem: ");
        int dias = sc.nextInt();

        double valorDiaria;

        if (dias < 10) {
            valorDiaria = (tipo.equalsIgnoreCase("S")) ? 100.0 : 140.0;
        } else if (dias <= 15) {
            valorDiaria = (tipo.equalsIgnoreCase("S")) ? 90.0 : 120.0;
        } else {
            valorDiaria = (tipo.equalsIgnoreCase("S")) ? 80.0 : 100.0;
        }

        double total = valorDiaria * dias;

        System.out.printf("O total a ser pago é de R$ %.2f", total);

        sc.close();
    }
}
