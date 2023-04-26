import java.util.Scanner;

public class Exercicio3_3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int canal;
        int totalPessoas = 0;
        int[] pessoasPorCanal = new int[5];
        
        // leitura dos dados
        do {
            System.out.print("Digite o número do canal (2, 4, 5, 7 ou 12): ");
            canal = sc.nextInt();
            
            if (canal == 0) {
                break;
            }
            
            System.out.print("Digite o número de pessoas assistindo: ");
            int pessoas = sc.nextInt();
            totalPessoas += pessoas;
            
            switch (canal) {
                case 2:
                    pessoasPorCanal[0] += pessoas;
                    break;
                case 4:
                    pessoasPorCanal[1] += pessoas;
                    break;
                case 5:
                    pessoasPorCanal[2] += pessoas;
                    break;
                case 7:
                    pessoasPorCanal[3] += pessoas;
                    break;
                case 12:
                    pessoasPorCanal[4] += pessoas;
                    break;
                default:
                    System.out.println("Canal inválido!");
                    break;
            }
            
        } while (canal != 0);
        
        // exibição dos resultados
        System.out.println("Audiência por canal:");
        System.out.println("Canal 2: " + (double) pessoasPorCanal[0] / totalPessoas * 100 + "%");
        System.out.println("Canal 4: " + (double) pessoasPorCanal[1] / totalPessoas * 100 + "%");
        System.out.println("Canal 5: " + (double) pessoasPorCanal[2] / totalPessoas * 100 + "%");
        System.out.println("Canal 7: " + (double) pessoasPorCanal[3] / totalPessoas * 100 + "%");
        System.out.println("Canal 12: " + (double) pessoasPorCanal[4] / totalPessoas * 100 + "%");
        
        sc.close();
    }

}
