package com.lista3_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Leitura do valor inteiro
        System.out.print("Digite um valor inteiro: ");
        int valor = scanner.nextInt();

        // Verificando se o valor é maior que 10 e exibindo a mensagem correspondente
        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }

        scanner.close();
    }
}
