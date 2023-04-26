import java.util.Scanner;

public class Exercicio5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int contador = 0;
        while (true) {
            System.out.print("Informe a idade (ou digite -1 para sair): ");
            int idade = sc.nextInt();
            if (idade == -1) {
                break;
            }
            soma += idade;
            contador++;
        }
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.printf("Média das idades: %.2f\n", media);
        } else {
            System.out.println("Nenhuma idade informada.");
        }
    }
}
