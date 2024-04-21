package com.lista3_algoritmos;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Os números em ordem crescente são: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
