import java.util.Scanner;

public class Exercicio3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matricula;
        do {
            System.out.print("Digite a matrícula do aluno (-1 para sair): ");
            matricula = sc.nextInt();
            if (matricula >= 0) {
                System.out.print("Digite a primeira nota: ");
                double nota1 = sc.nextDouble();
                System.out.print("Digite a segunda nota: ");
                double nota2 = sc.nextDouble();
                System.out.print("Digite a terceira nota: ");
                double nota3 = sc.nextDouble();

                double media = (nota1 + nota2 + nota3) / 3.0;
                String status;

                if (media >= 70.0) {
                    status = "Aprovado";
                } else if (media >= 60.0) {
                    status = "Recuperação";
                } else {
                    status = "Reprovado";
                }

                System.out.println("Aluno de matrícula " + matricula + " teve média " + media + " e está " + status);
            }
        } while (matricula >= 0);
    }

}
