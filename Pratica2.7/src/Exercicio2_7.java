import java.util.Scanner;

public class Exercicio2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        
        System.out.print("Informe o coeficiente a: ");
        a = sc.nextDouble();
        
        System.out.print("Informe o coeficiente b: ");
        b = sc.nextDouble();
        
        System.out.print("Informe o coeficiente c: ");
        c = sc.nextDouble();
        
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0 && b != 0) {
            System.out.println("Esta é uma equação de primeiro grau: x = " + (-c/b));
        } else {
            delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Esta é uma equação de segundo grau. Esta equação não possui raízes reais (delta < 0): delta = " + delta);
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("Esta é uma equação de segundo grau. Esta equação possui duas raízes reais iguais: x' = x'' = " + x1);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta é uma equação de segundo grau. Esta equação possui duas raízes reais diferentes: delta = " + delta + ", x' = " + x1 + ", x'' = " + x2);
            }
        }
        sc.close();
    }
}
