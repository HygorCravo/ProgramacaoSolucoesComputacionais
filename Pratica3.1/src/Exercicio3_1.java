import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();
        ArrayList<Integer> faltas = new ArrayList<>();
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        double somaNotas = 0.0;
        int qtdAlunos90 = 0;
        int qtdAlunosReprovados = 0;

        double nota;
        int qtdFaltas;
        do {
            System.out.print("Digite a nota final do aluno (-1 para sair): ");
            nota = sc.nextDouble();
            if (nota >= 0) {
                notas.add(nota);

                System.out.print("Digite o total de faltas do aluno: ");
                qtdFaltas = sc.nextInt();
                faltas.add(qtdFaltas);

                if (nota >= 90.0) {
                    qtdAlunos90++;
                }

                if (nota < 70.0 || qtdFaltas >= 20) {
                    qtdAlunosReprovados++;
                }

                if (nota > maiorNota) {
                    maiorNota = nota;
                }

                if (nota < menorNota) {
                    menorNota = nota;
                }

                somaNotas += nota;
            }
        } while (nota >= 0);

        double mediaNotas = somaNotas / notas.size();

        System.out.println("\nRESULTADOS:\n");
        System.out.println("Quantidade de alunos com nota maior ou igual a 90: " + qtdAlunos90);
        System.out.println("Quantidade de alunos reprovados por nota ou falta: " + qtdAlunosReprovados);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Média de notas da turma: " + mediaNotas);
    }

}
