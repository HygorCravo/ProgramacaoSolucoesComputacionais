import java.util.Scanner;

public class Exercicio5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, contMulheres = 0;
        char sexo;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Informe a idade da pessoa %d: ", i);
            idade = sc.nextInt();
            System.out.printf("Informe o sexo da pessoa %d (M/F): ", i);
            sexo = sc.next().charAt(0);

            if (sexo == 'F' && idade >= 20 && idade <= 40) {
                contMulheres++;
            }
        }

        System.out.printf("Existem %d mulheres entre 20 e 40 anos.", contMulheres);
        sc.close();
    }
}
