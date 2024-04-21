package com.lista2algoritmos;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o salário atual: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de aumento: ");
        double percentual = scanner.nextDouble();

        double aumento = salarioAtual * (percentual / 100);
        double novoSalario = salarioAtual + aumento;

        System.out.printf("O aumento será de R$%.2f, e o novo salário é de R$%.2f", aumento, novoSalario);

        scanner.close();
    }
}
