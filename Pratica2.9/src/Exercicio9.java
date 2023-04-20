import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Tabela de gravidades em m/s² nos planetas
        double[] gravidades = {3.7, 8.87, 9.8, 1.6, 3.711, 24.79, 10.44, 8.87, 11.15, 0.62};
        String[] planetas = {"Mercúrio", "Vênus", "Terra", "Lua", "Marte", "Júpiter", "Saturno", "Urano", "Netuno", "Plutão"};
        
        // Pedindo ao usuário para escolher o planeta
        System.out.println("Escolha um planeta para jogar a bola:");
        for (int i = 0; i < planetas.length; i++) {
            System.out.println((i+1) + " - " + planetas[i]);
        }
        int escolha = input.nextInt();
        
        // Pedindo ao usuário para informar a velocidade inicial e o instante de tempo
        System.out.println("Informe a velocidade inicial em m/s:");
        double v0 = input.nextDouble();
        System.out.println("Informe o instante de tempo em segundos:");
        double t = input.nextDouble();
        
        // Calculando a velocidade e a altura da bola no planeta escolhido
        double v = v0 - gravidades[escolha-1] * t;
        double h = v0 * t - 0.5 * gravidades[escolha-1] * t * t;
        
        // Imprimindo os resultados
        System.out.printf("No planeta %s:\n", planetas[escolha-1]);
        System.out.printf("Velocidade da bola no instante t: %.2f m/s\n", v);
        System.out.printf("Altura da bola no instante t: %.2f m\n", h);
    }

}
