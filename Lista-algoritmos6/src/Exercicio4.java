import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um número inteiro maior que 100: ");
        int numero = scanner.nextInt();

        if (numero <= 100) {
            System.out.println("O número deve ser maior que 100.");
            return;
        }

        //Variavel que controla se o numero é primo ou não 
        boolean ehPrimo = true;

        for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
            if (numero % divisor == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
