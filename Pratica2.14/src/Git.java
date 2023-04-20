import java.util.Scanner;

public class Git {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comando Git a ser explicado: ");
        String command = scanner.nextLine();
        scanner.close();

        switch (command) {
            case "git clone":
                System.out.println("O comando git clone é utilizado para fazer uma cópia de um repositório Git já existente.");
                System.out.println("Exemplo: git clone https://github.com/HygorCravo/ProgramacaoSolucoesComputacionais");
                break;
            case "git fetch":
                System.out.println("O comando git fetch é utilizado para buscar as atualizações de um repositório Git, mas sem aplicá-las no diretório de trabalho atual.");
                System.out.println("Exemplo: git fetch origin");
                break;
            case "git pull":
                System.out.println("O comando git pull é utilizado para buscar as atualizações de um repositório Git e aplicá-las no diretório de trabalho atual.");
                System.out.println("Exemplo: git pull origin main");
                break;
            default:
                System.out.println("Comando Git não reconhecido.");
                break;
        }
    }

}
