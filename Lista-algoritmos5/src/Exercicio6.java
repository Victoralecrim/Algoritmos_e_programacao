import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
  // Função que calcula Fibonacci
  static int getFibonacci(int n) {
    if (n <= 0) {
      throw new IllegalArgumentException("O valor de n deve ser maior que 0.");
    } else if (n == 1) {
      return 0;
    } else if (n == 2) {
      return 1;
    }
    return getFibonacci(n - 1) + getFibonacci(n - 2);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    /*
     * Escreva um programa que leia um número pelo teclado e mostre o elemento da
     * sequência de Fibonacci que está na posição representada pelo número lido. A
     * sequência de Fibonacci é definida como f(1) = 1, f(2) = 1 ... f(n) =
     * f(n-1)+f(n-2).
     */

    System.out.print("Digite a posição na sequência de Fibonacci: ");
    int numDigitado = scanner.nextInt();

    // Verificar se o número digitado é válido
    if (numDigitado <= 0) {
      System.out.println("O valor de n deve ser maior que 0.");
    } else {
      int contador = 1;
      int resultado = 0;

      while (contador <= numDigitado) {
        resultado = getFibonacci(contador);
        contador++;
      }

      System.out.println("O elemento na posição " + numDigitado + " da sequência de Fibonacci é: " + resultado);
    }

    scanner.close();
  }
}
