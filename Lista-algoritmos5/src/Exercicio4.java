import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite um número inteiro maior que 100:");

        // Solicita ao usuário que digite um número inteiro
        int numero = scanner.nextInt();

        // Verifica se o número é maior que 100
        if (numero <= 100) {
            System.out.println("O número precisa ser maior que 100.");
            return;
        }

        // Verifica se o número é primo
        boolean ehPrimo = true;
        int divisor = 2;
        while (divisor <= Math.sqrt(numero)) {
            if (numero % divisor == 0) {
                ehPrimo = false;
                break;
            }
            divisor++;
        }

        // Exibe o resultado
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        scanner.close();
    }

}
