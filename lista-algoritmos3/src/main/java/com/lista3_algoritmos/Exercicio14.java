package com.lista3_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Leitura do valor inteiro
        System.out.print("Digite um valor inteiro: ");
        int valor = scanner.nextInt();

        // Verificando se o valor é par ou ímpar e exibindo a mensagem correspondente
        if (valor % 2 == 0) {
            System.out.println("O valor é par.");
        } else {
            System.out.println("O valor é ímpar.");
        }

        scanner.close();
    }
}
