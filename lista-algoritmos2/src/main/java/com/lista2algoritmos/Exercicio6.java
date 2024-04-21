package com.lista2algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Declaração das variaveis de produto

        // Entrada de dados do usuario
        System.out.println("Digite o valor do primeiro produto: ");
        int prod1 = scanner.nextInt();
        System.out.println("Digite o valor do segundo produto: ");
        int prod2 = scanner.nextInt();
        System.out.println("Digite o valor do terceiro produto: ");
        int prod3 = scanner.nextInt();
        System.out.println("Digite o valor do quarto produto: ");
        int prod4 = scanner.nextInt();

        // Calculo dos valores das compras dos produtos

        // Atribuir a soma dos produtos a variavel de valorTotal
        // Declaração da variavel de valor Total da compra
        double ValorTotCompra = prod1 + prod2 + prod3 + prod4;

        // Declaração da variavel valor final da compra
        double valorFinalCompra = 0;

        // Declaração da variavel de desconto
        double desconto = 0;
        // LETRA A
        if (ValorTotCompra <= 100) {
            desconto = 0;
            valorFinalCompra = ValorTotCompra;
            System.out.println("Valor final da compra não atingiu o necessario para o desconto");
        }

        else {
            if (ValorTotCompra > 100 && ValorTotCompra < 200) {
                // valorFinalCompra = ValorTotCompra - (ValorTotCompra * desconto / 100);
                desconto = prod1 * 0.10;
                valorFinalCompra = ValorTotCompra - desconto;
                System.out.println(
                        "Valor final da compra com o desconto no primeiro produto foi de: " + valorFinalCompra);
            }

            else {
                // Letra c
                if (ValorTotCompra >= 200 && ValorTotCompra <= 500) {
                    desconto = prod1 * 0.15 + prod2 * 0.15;
                    valorFinalCompra = ValorTotCompra - desconto;
                } else {
                    // Letra D
                    if (ValorTotCompra > 500) {
                        desconto = ValorTotCompra * 0.25;
                        System.out.println("Valor final da compra com o desconto foi de: " + desconto);
                    }
                }
            }
        }
        scanner.close();
    }
}
