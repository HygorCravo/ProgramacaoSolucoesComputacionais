import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f\n", imc);

        if (imc < 20) {
            System.out.println("Situação de peso: Abaixo do Peso");
        } else if (imc < 25) {
            System.out.println("Situação de peso: Normal");
        } else if (imc < 30) {
            System.out.println("Situação de peso: Sobrepeso");
        } else if (imc < 40) {
            System.out.println("Situação de peso: Obesidade");
        } else {
            System.out.println("Situação de peso: Obesidade Mórbida");
        }

        sc.close();
    }
}
