import java.util.Scanner;

public class exercicio2Scanner {

	public static void main(String[] args) {
		
		Scanner receba = new Scanner(System.in);
		int anoNascimento, anoAtual, calculo, ano2050;
		
		System.out.print("Escreva o seu ano de nascimento \n");
		anoNascimento = receba.nextInt();
		
		System.out.print("Escreva o ano atual \n");
		anoAtual = receba.nextInt();
		
		calculo = anoAtual - anoNascimento;
		
		ano2050  = 2050 - anoNascimento;
		
		System.out.println("sua idade é: \n" + calculo);
		
		System.out.println("Voce tera esta idade em 2050: \n" + ano2050);
		
		// TODO Auto-generated method stub

	}

}
