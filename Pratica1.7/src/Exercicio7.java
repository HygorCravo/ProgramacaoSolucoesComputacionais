import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do salário mínimo: R$ ");
        double salarioMinimo = scanner.nextDouble();
        System.out.print("Digite o valor do salário do funcionário: R$ ");
        double salarioFuncionario = scanner.nextDouble();
        double qtdSalariosMinimos = salarioFuncionario / salarioMinimo;
        System.out.printf("O funcionário recebe %.2f salários mínimos.", qtdSalariosMinimos);
    }
}
