import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota1, nota2, nota3, media;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 0 && media < 3) {
            System.out.println("REPROVADO");
        } else if (media >= 3 && media < 7) {
            System.out.println("EXAME");
        } else if (media >= 7 && media <= 10) {
            System.out.println("APROVADO");
        } else {
            System.out.println("Média inválida");
        }
        
        scanner.close();
    }

}
