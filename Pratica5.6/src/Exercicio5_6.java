import java.util.Scanner;

public class Exercicio5_6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Informe a idade da %dª pessoa: ", i);
            int idade = sc.nextInt();
            soma += idade;
        }
        
        double media = soma / 10.0;
        System.out.printf("A média das idades é: %.2f", media);
        
        sc.close();
    }

}
