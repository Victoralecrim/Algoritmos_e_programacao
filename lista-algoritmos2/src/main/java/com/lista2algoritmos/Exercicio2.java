package com.lista2algoritmos;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a primeira nota: ");
        var nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota: ");
        var nota2 = scanner.nextInt();

        System.out.println("Digite a terceira nota: ");
        var nota3 = scanner.nextInt();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media aritmetica entre as notas é de: " + media);

        scanner.close();

    }
}
