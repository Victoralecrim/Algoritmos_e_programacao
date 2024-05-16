import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitar e ler os valores dos pontos p1 e p2
        System.out.println("Digite as coordenadas do ponto p1 (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Digite as coordenadas do ponto p2 (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calcular a distância entre os pontos usando a fórmula da distância euclidiana
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Mostrar o resultado com 4 casas decimais após a vírgula
        System.out.printf("A distância entre os pontos p1 e p2 é: %.4f\n", distancia);

        scanner.close();
    }
}
