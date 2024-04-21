package com.lista3_algoritmos;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nQuestão 04:");
        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();
        double media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / (2 + 3 + 5);
        System.out.println("A média final é: " + media);

        scanner.close();
    }
}
