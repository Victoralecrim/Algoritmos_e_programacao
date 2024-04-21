package com.lista2algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o salário base: ");
        double salarioBase = scanner.nextDouble();

        double gratificacao = salarioBase * 0.05;
        double salarioBruto = salarioBase + gratificacao;
        double imposto = salarioBruto * 0.07;
        double salarioLiquido = salarioBruto - imposto;

        System.out.printf("Gratificação: R$%.2f", gratificacao);
        System.out.printf("\nSalário bruto: R$%.2f", salarioBruto);
        System.out.printf("\nImposto: R$%.2f", imposto);
        System.out.printf("\nSalário líquido: R$%.2f", salarioLiquido);

        scanner.close();
    }
}