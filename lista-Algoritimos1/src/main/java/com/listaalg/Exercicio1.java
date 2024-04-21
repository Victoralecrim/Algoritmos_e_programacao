package com.listaalg;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        // Passo 1: Ler 3 valores de ponto flutuante
        System.out.println("Digite o valor de A:");
        double A = ler.nextDouble();

        System.out.println("Digite o valor de B:");
        double B = ler.nextDouble();

        System.out.println("Digite o valor de C:");
        double C = ler.nextDouble();

        // Passo 3: Calcular o delta
        double delta = (B * B) - 4 * A * C;

        // Passo 4: Calcular as raízes de Bhaskara x1 e x2:

        if (A != 0 && delta >= 0) {
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.println("R1: " + x1);
            System.out.println("R2: " + x2);
        } else {
            System.out.println("Impossivel calcular");
        }

        ler.close();
    }
}
