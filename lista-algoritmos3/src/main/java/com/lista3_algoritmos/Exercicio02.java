package com.lista3_algoritmos;
 import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nQuestão 02:");
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        double areaRetangulo = base * altura;
        System.out.println("A área do retângulo é: " + areaRetangulo);

        scanner.close();
    }
}
