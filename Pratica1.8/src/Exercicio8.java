import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o peso da pessoa: ");
        double peso = sc.nextDouble();
        
        double novoPesoAumento = peso * 1.15;
        double novoPesoReducao = peso * 0.8;
        
        System.out.println("Se a pessoa engordar 15%, o novo peso será " + String.format("%.2f", novoPesoAumento));
        System.out.println("Se a pessoa emagrecer 20%, o novo peso será " + String.format("%.2f", novoPesoReducao));
        
        sc.close();
    }
}
