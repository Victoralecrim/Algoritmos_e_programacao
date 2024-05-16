import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitar e ler o valor inteiro X
        System.out.println("Digite um valor inteiro X:");
        int x = scanner.nextInt();

        // Mostrar X se for ímpar
        if (x % 2 != 0) {
            System.out.println(x);
        }

        // Mostrar os próximos 3 valores ímpares consecutivos a partir de X
        if ((x + 1) % 2 != 0) {
            System.out.println(x + 1);
        }
        if ((x + 2) % 2 != 0) {
            System.out.println(x + 2);
        }
        if ((x + 3) % 2 != 0) {
            System.out.println(x + 3);
        }
        if ((x + 4) % 2 != 0) {
            System.out.println(x + 4);
        }
        if ((x + 5) % 2 != 0) {
            System.out.println(x + 5);
        }


        scanner.close();
    }
}
