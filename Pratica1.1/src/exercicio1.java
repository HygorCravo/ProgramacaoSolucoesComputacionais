import java.util.Scanner;
import javax.swing.JOptionPane;

public class exercicio1 {
		
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int numero1, numero2, numero3, media;
		
		System.out.print("Determine o primeiro numero: \n");
		numero1 = leitura.nextInt();
		
		System.out.print("Determine o segunda numero: \n");
		numero2 = leitura.nextInt();
		
		System.out.print("Determine o terceiro numero: \n");
		numero3 = leitura.nextInt();
		
		media = (numero1 + numero2 + numero3) / 3 ;
		
		System.out.println("A media é: " + media);
		// TODO Auto-generated method stub

	}

}


