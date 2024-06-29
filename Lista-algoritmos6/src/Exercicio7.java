import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Variáveis para contagem e soma
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        int somaValoresPositivos = 0;
        int somaValoresNegativos = 0;

        // Loop for para ler 15 valores
        for (int contador = 1; contador <= 15; contador++) {
            System.out.println("Digite o " + contador + "º número: ");
            int numero = scanner.nextInt();

            // Verificação e contagem de números positivos
            if (numero > 0) {
                contadorPositivo++;
                somaValoresPositivos += numero;
            }

            // Verificação e contagem de números negativos
            if (numero < 0) {
                contadorNegativo++;
                somaValoresNegativos += numero;
            }

            
        }

        // Exibição dos resultados
        System.out.println("Quantidade de números positivos: " + contadorPositivo);
        System.out.println("Quantidade de números negativos: " + contadorNegativo);
        System.out.println("Soma de todos os valores positivos: " + somaValoresPositivos);
        System.out.println("Soma de todos os valores negativos: " + somaValoresNegativos);

        scanner.close();
    }
}
