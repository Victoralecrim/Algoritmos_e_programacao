import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numDig;

        do {
            System.out.println("Digite um número maior que 20: ");
            numDig = scanner.nextInt();
        } while (numDig <= 20);

        System.out.print("Seus divisores são: ");

        // Laço para encontrar divisores
        for (int divisor = 1; divisor <= numDig; divisor++) {
            if (numDig % divisor == 0) {
                System.out.print(divisor + "\t");
            }
        }

        scanner.close();
    }
}
