package com.lista3_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // Leitura do custo de fábrica do carro
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        // Calculando o custo final ao consumidor

        //Variaveis que informam as porcentagens de custo
        double percentualDistribuidor = 0.28;
        double impostos = 0.45;

        //Calculando o custo final ao consumidor
        double custoFinal = custoFabrica + (custoFabrica * percentualDistribuidor) + (custoFabrica * impostos);

        // Exibindo o custo final ao consumidor
        System.out.println("O custo final ao consumidor é: " + custoFinal);

        scanner.close();
    }
}
