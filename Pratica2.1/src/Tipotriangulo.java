import java.util.Scanner;

public class Tipotriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado A do triângulo: ");
        double a = sc.nextDouble();

        System.out.print("Digite o lado B do triângulo: ");
        double b = sc.nextDouble();

        System.out.print("Digite o lado C do triângulo: ");
        double c = sc.nextDouble();

        if (a == b && b == c) {
            System.out.println("Triângulo equilátero.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triângulo isósceles.");
        } else {
            System.out.println("Triângulo escaleno.");
        }

        sc.close();
    }
}
