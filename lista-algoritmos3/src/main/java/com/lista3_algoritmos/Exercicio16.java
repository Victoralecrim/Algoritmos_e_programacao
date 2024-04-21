package com.lista3_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Codifique um programa que leia um par ordenado (x, y) e informe a qual
        // quadrante ele pertence.

        System.out.println("Digite um número: ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("O par ordenado (" + x + ", " + y + ") pertence ao primeiro quadrante.");
        }

        else if (x < 0 && y > 0) {
            System.out.println("O par ordenado (" + x + ", " + y + ") pertence ao segundo quadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("O par ordenado (" + x + ", " + y + ") pertence ao terceiro quadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("O par ordenado (" + x + ", " + y + ") pertence ao quarto quadrante.");
        } else {
            System.out.println("O par ordenado (" + x + ", " + y + ") está sobre os eixos.");
        }

        scanner.close();

    }
}
