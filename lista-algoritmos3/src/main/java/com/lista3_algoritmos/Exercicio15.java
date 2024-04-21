package com.lista3_algoritmos;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // As maças custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$
        // 1,00 se forem compradas pelo menos 12. Escreva um programa que leia o
        // número de maças compradas, calcule e escreva o custo total da compra.

        System.out.println("Digite o numero de maças compradas: ");
        int quantidadeMaçãs = scanner.nextInt();

        // Calcular o total da compra
        double totalCompra = scanner.nextDouble();

        if (quantidadeMaçãs < 12) {
            totalCompra = quantidadeMaçãs * 1.30;
        }

        else {
            totalCompra = quantidadeMaçãs * 1.00;
        }

        System.out.println("O custo total da compra é: R$ " + totalCompra);

        scanner.close();
    }
}
