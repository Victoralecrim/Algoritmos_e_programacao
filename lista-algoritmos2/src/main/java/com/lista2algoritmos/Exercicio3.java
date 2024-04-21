package com.lista2algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o salário atual: ");
        double salarioAtual = scanner.nextDouble();

        double aumento = salarioAtual * 0.25;
        double novoSalario = salarioAtual + aumento;

        System.out.printf("O novo salário com 25%% de aumento é: R$%.2f", novoSalario);

        scanner.close();
    }
}
