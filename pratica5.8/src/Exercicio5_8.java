import java.util.Scanner;

public class Exercicio5_8 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Digite o primeiro número: ");
      int num1 = sc.nextInt();

      System.out.print("Digite o segundo número: ");
      int num2 = sc.nextInt();

      int potencia = 1;

      for (int i = 1; i <= num2; i++) {
         potencia *= num1;
      }

      System.out.println(num1 + " elevado a " + num2 + " é igual a " + potencia);
   }
}
