import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a posição do elemento: ");
        int posicao = scanner.nextInt();

        if (posicao < 1) {
            System.out.println("A posição deve ser maior que 0.");
            return;
        }

        // Variáveis para armazenar os elementos anteriores da sequência
        int anteriorAnterior = 1;
        int anterior = 1;

        // Elemento na posição 1
        int elemento = 1;

        for (int i = 2; i <= posicao; i++) {
            // Cálculo do elemento atual da posição de fibonacci
            elemento = anteriorAnterior + anterior;

            // Atualização dos elementos anteriores
            anteriorAnterior = anterior;
            anterior = elemento;
        }

        System.out.println("Elemento na posição " + posicao + ": " + elemento);

        scanner.close();
    }
}
