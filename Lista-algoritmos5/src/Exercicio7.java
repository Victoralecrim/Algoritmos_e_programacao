import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    /*
     * Elaborar um algoritmo que leia 15 valores inteiros. O algoritmo não poderá
     * aceitar o número zero. Mostrar:
     * 
     * a) quantidade de números positivos
     * 
     * b) quantidade de números negativos
     * 
     * c) soma de todos os valores positivos
     * 
     * d) soma de todos os valores negativos
     */

    int contador = 0;
    int contadorPositive = 0;
    int contadorNegative = 0;
    int somaNpositivos = 0;
    int somaNnegativos = 0;

    while (contador < 15) {
      System.out.println("Digite um numero: ");
      int numDig = scanner.nextInt();
      /*
       * O algoritmo não poderá aceitar o número zero
       */

      if (numDig > 0) {
        contadorPositive++;
        somaNpositivos += numDig;
        contador++;
      } else if (numDig < 0) {
        contadorNegative++;
        somaNnegativos += numDig;
        contador++;
      } else {
        System.out.println("O numero digitado não pode ser zero.");
      }
    }

    System.out.println("Quantidade de números positivos: " + contadorPositive);
    System.out.println("Quantidade de números negativos: " + contadorNegative);
    System.out.println("Soma de todos os valores positivos: " + somaNpositivos);
    System.out.println("Soma de todos os valores negativos: " + somaNnegativos);

    scanner.close();
  }
}
