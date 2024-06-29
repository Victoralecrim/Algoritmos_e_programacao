import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.print("Digite uma string: ");
    String texto = scanner.nextLine().toLowerCase();
    int[] contagem = new int[5];

    for (char letra : texto.toCharArray()) {
      switch (letra) {
        case 'a':
          contagem[0]++;
          break;
        case 'e':
          contagem[1]++;
          break;
        case 'i':
          contagem[2]++;
          break;
        case 'o':
          contagem[3]++;
          break;
        case 'u':
          contagem[4]++;
          break;
      }
      scanner.close();
    }

    System.out.println("A: " + contagem[0]);
    System.out.println("E: " + contagem[1]);
    System.out.println("I: " + contagem[2]);
    System.out.println("O: " + contagem[3]);
    System.out.println("U: " + contagem[4]);
  }
}
