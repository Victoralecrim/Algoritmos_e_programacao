package com.listaalg;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro N (0 < N < 46):");
        int numero = scanner.nextInt();

        if (numero < 0 || numero >= 46) {
            System.out.println("Valor inválido para N. Certifique-se de que 0 < N < 46.");
        } else {
            System.out.println("Série de Fibonacci para os primeiros " + numero + " números:");

            for (int i = 0; i < numero; i++) {
                System.out.print(calcularFibonacci(i) + " ");
            }
        }

        scanner.close();
    }

    public static int calcularFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
