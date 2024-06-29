import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Variáveis para armazenar o menor e maior valor
        int menorValor = 0;
        int maiorValor = 0;

        // Loop for para iterar 10 vezes
        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            // Atualizar o menor valor
            menorValor = Math.min(menorValor, numero);

            // Atualizar o maior valor
            maiorValor = Math.max(maiorValor, numero);
        }

        System.out.println("O menor número é: " + menorValor);
        System.out.println("O maior número é: " + maiorValor);

        scanner.close();
    }
}
