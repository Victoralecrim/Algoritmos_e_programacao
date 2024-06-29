import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    /*
     * Escreva um programa que leia um número maior que 30 pelo teclado e informe
     * todos os números entre 0 e o valor informado que são múltiplos de 2 ou 7.
     */

    System.out.print("Digite um número maior que 30: ");
    int numDigitado = scanner.nextInt();

    if (numDigitado <= 30) {
      System.out.println("O número deve ser maior que 30.");
    } else {
      System.out.println("Números entre 0 e " + numDigitado + " que são múltiplos de 2 ou 7:");

      int divisor = 0;

      while (divisor <= numDigitado) {
        if (divisor % 2 == 0 || divisor % 7 == 0) {
          System.out.println(divisor);
        }
        divisor++;
      }
    }

    scanner.close();
  }
}
