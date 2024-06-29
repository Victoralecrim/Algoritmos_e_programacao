import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Escreva um programa que leia 10 números pelo teclado e informe a média dos
        // valores informados.
        
        int totalNumeros = 10;
        double soma = 0;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        double media = soma / totalNumeros;
        System.out.println("A média dos números informados é: " + media);

        scanner.close();
    }
}
