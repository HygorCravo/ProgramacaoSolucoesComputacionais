import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Somar os dois números");
        System.out.println("2 - Multiplicar os dois números");
        System.out.println("3 - Subtrair o número maior pelo número menor");
        System.out.println("4 - Dividir o primeiro número pelo segundo");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado da soma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado da multiplicação: " + (num1 * num2));
                break;
            case 3:
                double resultadoSubtracao = num1 > num2 ? num1 - num2 : num2 - num1;
                System.out.println("Resultado da subtração: " + resultadoSubtracao);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero");
                } else {
                    System.out.println("Resultado da divisão: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
