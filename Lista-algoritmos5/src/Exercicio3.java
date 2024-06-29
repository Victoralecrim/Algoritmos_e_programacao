import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    /*
     * Escreva um programa que solicite que o usuário informe um número inteiro
     * maior que 20 e mostre na tela todos os divisores do número informado. Todos
     * os valores devem ser mostrados na mesma linha, separador por tabulação (“\t”)
     */
    int cont = 1;
    int numdig = 0;

    do {
      System.out.println("Dígite um número maior que 20: ");
      numdig = scanner.nextInt();
    } while (numdig < 20);

    System.out.print("Seus divisores são: ");
    // Enquanto o contador não for igual ao número digitado, faca:
    while (cont <= numdig) {
      // Se o resto da div for igual a 0, é divisor
      if (numdig % cont == 0) {
        System.out.print(cont + "\t");
      }
      cont++;
    }

    scanner.close();
  }
}
