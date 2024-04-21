package com.lista3_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um caracter de A a Z: ");
        char caracter = scanner.next().charAt(0);

        int codigoASC2 = (int) caracter;
        int antecessor = (codigoASC2 - 1);
        int sucessor = (codigoASC2 + 1);

        System.out.println("O caracter antecessor é: " + ((char) antecessor) + " O sucessor é: " + ((char) sucessor));

        scanner.close();
    }
}
