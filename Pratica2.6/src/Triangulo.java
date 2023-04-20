import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o primeiro lado em cm: ");
        double a = sc.nextDouble();
        
        System.out.print("Informe o segundo lado em cm: ");
        double b = sc.nextDouble();
        
        System.out.print("Informe o terceiro lado em cm: ");
        double c = sc.nextDouble();
        
        boolean condicao1 = Math.abs(b - c) < a && a < b + c;
        boolean condicao2 = Math.abs(a - c) < b && b < a + c;
        boolean condicao3 = Math.abs(a - b) < c && c < a + b;
        
        if (condicao1 && condicao2 && condicao3) {
            System.out.println("Os três valores informados podem ser os comprimentos dos lados de um triângulo.");
        } else {
            System.out.println("Os três valores informados não podem ser os comprimentos dos lados de um triângulo.");
        }
        
        sc.close();
    }

}
