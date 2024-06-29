import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o menor número: ");
        int menor = scanner.nextInt();

        System.out.println("Digite o maior número: ");
        int maior = scanner.nextInt();

        if (menor > maior) {
            System.out.println("O menor número deve ser menor que o maior.");
            return;
        }

        System.out.print("Números pares entre " + menor + " e " + maior + ": ");

        for (int numero = menor; numero <= maior; numero++) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }

        scanner.close();
    }
}
