package com.lista3_algoritmos;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Faça um programa para ler: a descrição do produto (nome), a quantidade
        // adquirida e o preço unitário. Calcular e escrever o total 
        //(total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), 
        //sabendo-se que:
        // Se quantidade <= 5 o desconto será ́ de 2%
        // Se quantidade > 5 e quantidade <= 10 o desconto será ́ de 3%
        // Se quantidade > 10 o desconto será ́ de 5%

        System.out.println("Digite a descrição do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite a quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        System.out.println("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        double totalPagamento = quantidade * precoUnitario;

        double desconto = 0;

        if (quantidade <= 5) {
            desconto = totalPagamento * 0.02;
        } else if (quantidade <= 10) {
            desconto = totalPagamento * 0.03;
        } else {
            desconto = totalPagamento * 0.05;
        }

        double totalPagar = totalPagamento - desconto;

        System.out.println("Total: R$ " + totalPagamento);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total a pagar: R$ " + totalPagar);

        scanner.close();
    }
}
