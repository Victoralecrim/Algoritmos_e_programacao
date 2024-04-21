package com.lista2algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite quatro números inteiros:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int soma = n1 + n2 + n3 + n4;
        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}