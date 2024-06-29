import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
  private static boolean isPrimo(int numero) {
    if (numero <= 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(numero); i++) {
      if (numero % i == 0) {
        return false;
      }
    }

    return true;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Digite o limite inferior: ");
    int limiteInferior = scanner.nextInt();

    System.out.print("Digite o limite superior: ");
    int limiteSuperior = scanner.nextInt();

    System.out.println("Números primos no intervalo (" + limiteInferior + " - " + limiteSuperior + "):");

    for (int numero = limiteInferior; numero <= limiteSuperior; numero++) {
      if (isPrimo(numero)) {
        System.out.print(numero + " ");
      }
    }
    scanner.close();
  }

}
