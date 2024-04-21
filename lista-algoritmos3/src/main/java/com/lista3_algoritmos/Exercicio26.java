package com.lista3_algoritmos;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Ler dois valores e imprimir uma das três mensagens a seguir:
        // Números iguais, caso os números sejam iguais
        // Primeiro é maior, caso o primeiro seja maior que o segundo;
        // Segundo maior, caso o segundo seja maior que o primeiro.

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        if (valor1 == valor2) {
            System.out.println("Os valores são iguais");
        } else {
            if (valor1 > valor2) {
                System.out.println("Valor1 é maior que valor2");
            }
            if (valor2 > valor1) {
                System.out.println("Valor2 é maior que valor1");
            }

            else {
                System.out.println("Os valores fornecidos não são validos! ");
            }
        }

        scanner.close();
    }
}
