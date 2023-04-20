import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        double cotacaoDolar = 5.01; // cotação do dólar em reais
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em dólares: ");
        double valorDolar = scanner.nextDouble();
        double valorReal = valorDolar * cotacaoDolar;
        System.out.printf("O valor em reais é: R$%.2f", valorReal);
    }
}
