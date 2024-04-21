package com.lista3_algoritmos;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva um numero: ");
        double numero = scanner.nextDouble();

        if (numero > 0.0) {
            System.out.println("Numero positivo");
        }

        else if (numero < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("Numero é zero");
        }

        scanner.close();
    }
}
