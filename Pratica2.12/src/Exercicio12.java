import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        
        System.out.print("Digite o sexo (M/F): ");
        char sexo = sc.next().charAt(0);
        
        double mensalidade = 0.0;
        
        if (sexo == 'M') {
            if (idade <= 15) {
                mensalidade = 60.0;
            } else if (idade <= 18) {
                mensalidade = 75.0;
            } else if (idade <= 25) {
                mensalidade = 90.0;
            } else if (idade <= 40) {
                mensalidade = 85.0;
            } else {
                mensalidade = 80.0;
            }
        } else if (sexo == 'F') {
            if (idade <= 15) {
                mensalidade = 60.0;
            } else if (idade <= 18) {
                mensalidade = 60.0;
            } else if (idade <= 30) {
                mensalidade = 90.0;
            } else if (idade <= 40) {
                mensalidade = 85.0;
            } else {
                mensalidade = 80.0;
            }
        } else {
            System.out.println("Sexo inválido.");
            System.exit(0);
        }
        
        System.out.println("Valor da mensalidade: R$ " + mensalidade);
        
        sc.close();
    }
}
