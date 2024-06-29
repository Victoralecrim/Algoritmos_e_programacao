import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um número maior que 30: ");
        int limiteSuperior = scanner.nextInt();

        if (limiteSuperior <= 30) {
            System.out.println("O número deve ser maior que 30.");
            return;
        }

        System.out.print("Números múltiplos de 2 ou 7 entre 0 e " + limiteSuperior + ": ");

        for (int numero = 0; numero <= limiteSuperior; numero++) {
            if (numero % 2 == 0 || numero % 7 == 0) {
                System.out.print(numero + " ");
            }
        }

        scanner.close();
    }
}
