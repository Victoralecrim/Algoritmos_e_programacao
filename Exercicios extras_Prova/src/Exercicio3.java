import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Escreva um programa em Java que leia um valor com duas casas decimais,
        // equivalente ao salário de uma pessoa. Em seguida, calcule e mostre o valor
        // que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

        // 0 - 2000,00 = Isento

        // 2000,01 - 3000,00 = 8%

        // 3000,01 - 4500,00 = 18%

        // >4500 = 28%

        // Lembre-se que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas
        // sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00
        // é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8%
        // sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O
        // valor deve ser impresso com duas casas decimais.

        // Solicitar e ler o salário da pessoa
        System.out.println("Digite o salário da pessoa (com duas casas decimais):");
        double salario = scanner.nextDouble();

        // Variavel que calcula o imposto de renda
        double impostoRenda = 0.0;

        if (salario <= 2000) {
            impostoRenda = 0.0;
            System.out.println("Isento de imposto ");
        } else if (salario <= 3000) {
            impostoRenda = (salario - 2000) * 0.08; // 8%
        } else if (salario <= 4500) {
            impostoRenda = (salario - 3000) * 0.18 + 1000 * 0.08; //
        } else {
            impostoRenda = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08; // 28%
        }

        // Mostrar o valor do Imposto de Renda com duas casas decimais
        System.out.printf("O valor do Imposto de Renda a ser pago é: %.2f\n", impostoRenda);

        scanner.close();
    }
}
