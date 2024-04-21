package com.lista3_algoritmos;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Escreva um programa que leia três valores para os lados de um triângulo. O
        // programa deve verificar se os lados fornecidos formam realmente um triângulo,
        // e caso esta condição seja verdadeira, se o triângulo é equilátero (todos
        // lados
        // iguais), isósceles (dois lados iguais) ou escaleno (todos lados diferentes).

        System.out.println("Digite o lado 1 do triângulo: ");
        double ladoA = scanner.nextDouble();

        System.out.println("Digite o lado 2 do triângulo: ");
        double ladoB = scanner.nextDouble();

        System.out.println("Digite o lado 3 do triângulo: ");
        double ladoC = scanner.nextDouble();

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            System.out.println("Os valores fornecidos formam um triângulo.");
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triangulo equilatero (todos os lados iguais).");
            } else {
                if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                    System.out.println("Triangulo isósceles (dois lados iguais).");
                } else {
                    System.out.println("Triangulo escaleno (todos os lados diferentes).");
                }
            }

        } else {
            System.out.println("Os valores fornecidos não formam um triângulo");
        }

        scanner.close();
    }
}
