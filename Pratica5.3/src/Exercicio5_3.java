import java.util.Scanner;

public class Exercicio5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número para calcular o fatorial: ");
        int num = sc.nextInt();
        
        if (num < 0) {
            System.out.println("Número inválido!");
        } else {
            int fatorial = 1;
            
            for (int i = num; i > 0; i--) {
                fatorial *= i;
            }
            
            System.out.printf("%d! = %d\n", num, fatorial);
        }
        
        sc.close();
    }
}
