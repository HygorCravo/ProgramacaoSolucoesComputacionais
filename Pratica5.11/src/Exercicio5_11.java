import java.util.Scanner;

public class Exercicio5_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int masculinoEntre60e80 = 0;
        int femininoEntre50e70 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o sexo da pessoa %d (M ou F): ", i);
            char sexo = input.next().charAt(0);
            System.out.printf("Digite o peso da pessoa %d: ", i);
            double peso = input.nextDouble();

            if (sexo == 'M' && peso >= 60 && peso <= 80) {
                masculinoEntre60e80++;
            } else if (sexo == 'F' && peso >= 50 && peso <= 70) {
                femininoEntre50e70++;
            }
        }

        System.out.printf("Quantidade de homens entre 60 e 80 kg: %d%n", masculinoEntre60e80);
        System.out.printf("Quantidade de mulheres entre 50 e 70 kg: %d%n", femininoEntre50e70);
    }
}
