import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o primeiro termo: ");
        int primeiroTermo = scanner.nextInt();

        System.out.print("Digite a razão: ");
        int razao = scanner.nextInt();

        System.out.print("Digite quantos termos você deseja exibir: ");
        int nTermos = scanner.nextInt();

        System.out.println("Progressão Aritmética:");

        for (int i = 0; i < nTermos; i++) {
            int termo = primeiroTermo + i * razao;
            System.out.print(termo + " ");
        }
        scanner.close();
    }
}
