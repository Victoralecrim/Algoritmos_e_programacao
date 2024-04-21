package com.listaalg;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        // Leia um valor de ponto flutuante com duas casas decimais. Este valor
        // representa um
        // valor monetário. A seguir, calcule o menor número de notas e moedas possíveis
        // no
        // qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20,
        // 10, 5, 2.
        // As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre
        // a relação
        // de notas necessárias.
        // Entrada:
        // Leia um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
        // Saída:
        // Imprima a quanƟdade mínima de notas e moedas necessárias para trocar o valor
        // inicial, conforme exemplo fornecido.

        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        // Usuario Informando o valor
        System.out.println("Digite o valor: ");
        // Lendo o valor da variavel
        var valor = ler.nextDouble();

        // 2-Calcule o menor número de notas e moedas possíveis no qual o valor pode ser
        // decomposto.

        // notas consideradas são de 100, 50, 20, 10, 5, 2.
        // As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.

        // OBS: Decompor = dividir

        // Quantidade de notas a serem decompostas
        var qt_notas100 = valor / 100;
        var qt_notas50 = valor / 50;
        var qt_notas20 = valor / 20;
        var qt_notas10 = valor / 10;
        var qt_notas5 = valor / 5;
        var qt_notas2 = valor / 2;

        //Resto dos valores em notas a serem decompostos
        var qt_resto = valor % 100;
        var qt_resto50 = valor % 50; 
        var qt_resto20 = valor % 20;
        var qt_resto10 = valor % 10;
        var qt_resto5 = valor % 5;
        var qt_resto2 = valor % 2;

        //Quantidade de moedas a serem decompostas
        var qt_moedas1 = valor / 1;
        var qt_moedas050 = valor / 0.50;
        var qt_moedas025 = valor / 0.25;
        var qt_moedas010 = valor / 0.10;
        var qt_moedas005 = valor / 0.05;
        var qt_moedas001 = valor / 0.01;

        //Resto dos valores em moeda
        var qt_resto_moedas1 = valor % 1;
        var qt_resto_moedas050 = valor % 0.50;
        var qt_resto_moedas025 = valor % 0.25;
        var qt_resto_moedas010 = valor % 0.10;
        var qt_resto_moedas005 = valor % 0.05;
        var qt_resto_moedas001 = valor % 0.01;
        
        

        ler.close();
    }
}
