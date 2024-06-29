import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int contador = 0;
        int somaNumeros = 0;

        while (contador < 10) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            somaNumeros += numero;
            contador++;

        }

        double media = somaNumeros / 10;
        System.out.println("A media dos 10 valores digitados pelo usuario é: " + media);
        scanner.close();
    }
}
