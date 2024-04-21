package com.lista3_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Leitura dos cinco valores inteiros
        int[] valores = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor inteiro: ");
            valores[i] = scanner.nextInt();
        }

        // Encontrando o maior e o menor valor
        int maior = valores[0];
        int menor = valores[0];
        for (int i = 1; i < 5; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        // Exibindo o maior e o menor valor
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

        scanner.close();

    }
}
