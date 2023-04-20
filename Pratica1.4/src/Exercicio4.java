import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário atual do funcionário: R$");
        double salarioAtual = scanner.nextDouble();
        double novoSalario = salarioAtual * 1.25; // aumento de 25%
        System.out.printf("O novo salário do funcionário é: R$%.2f", novoSalario);
    }
}
