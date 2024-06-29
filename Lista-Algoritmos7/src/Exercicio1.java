import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // 1. Crie um programa que solicite um número inteiro ao usuário e imprima a
        // tabuada desse número de 1 a 10.

        System.out.println("Digite um número de 1 a 10: ");
        int numeroDigitado = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numeroDigitado + " * " + i + " = " + numeroDigitado * i);
        }

        scanner.close();

    }
}
