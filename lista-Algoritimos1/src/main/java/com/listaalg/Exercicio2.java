package com.listaalg;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Leitura das notas A e B
        System.out.println("Digite a nota A:");
        double notaA = scanner.nextDouble();

        System.out.println("Digite a nota B:");
        double notaB = scanner.nextDouble();

        // Cálculo da média com pesos
        double media = ((notaA * 3.5) + (notaB * 7.5)) / 11;

        // Impressão do resultado com formatação
        System.out.printf(Locale.US, "MEDIA = %.5f%n", media);

        scanner.close();
    }
}

