package com.lista3_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

        // Leitura do valor de x
        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();

        // Calculando e exibindo o valor de cada expressão para o valor de x fornecido
        double y;

        // Expressão a) y = x^3 + 5x^7 + 2x^9
        y = Math.pow(x, 3) + 5 * Math.pow(x, 7) + 2 * Math.pow(x, 9);
        System.out.println("a) y = " + y);

        // Expressão b) y = sen(x)
        y = Math.sin(x);
        System.out.println("b) y = " + y);

        // Expressão c) y = (1 + 1/x) * x
        y = (1 + 1 / x) * x;
        System.out.println("c) y = " + y);

        // Expressão d) y = sqrt(ln(|x| + 1)) + log2(|x| + 1)
        y = Math.sqrt(Math.log(Math.abs(x) + 1)) + Math.log(Math.abs(x) + 1) / Math.log(2);
        System.out.println("d) y = " + y);

        // Expressão e) y = arcsen(x) + arccos(x)
        y = Math.asin(x) + Math.acos(x);
        System.out.println("e) y = " + y);

        scanner.close();
    }
}
