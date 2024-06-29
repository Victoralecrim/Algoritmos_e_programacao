import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    int numeroSecreto = random.nextInt(100) + 1; // Gera número entre 1 e 100
    int tentativa = 0;
    int palpite;

    System.out.println("Bem-vindo ao Jogo da Adivinhação!");

    do {
      System.out.print("Digite um palpite (entre 1 e 100): ");
      palpite = scanner.nextInt();
      tentativa++;

      if (palpite < numeroSecreto) {
        System.out.println("O seu palpite é menor que o número secreto.");
      } else if (palpite > numeroSecreto) {
        System.out.println("O seu palpite é maior que o número secreto.");
      } else {
        System.out.printf("Parabéns! Você adivinhou o número em %d tentativas!\n", tentativa);
      }
    } while (palpite != numeroSecreto);
    
    scanner.close();
  }
}
