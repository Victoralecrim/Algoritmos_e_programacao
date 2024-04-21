package com.lista3_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // // Escrever um programa para ler duas notas de um aluno e escrever na tela a
        // palavra “Aprovado” se a média das duas notas for maior ou igual a 7,0. Caso
        // a
        // média seja inferior a 7,0, o programa deve ler uma nova nota relativa ao
        // Exame
        // Final e calcular e imprimir o resultado com a média final. Se esta média for
        // maior
        // ou igual a 7,0, o programa deve escrever “Aprovado” com a nota Fixa 6, caso
        // contrário deve escrever "Reprovado".

        System.out.println("Digite a nota do primeiro aluno: ");
        double nota_aluno1 = scanner.nextDouble();

        System.out.println("Digite a nota do segundo aluno: ");
        double nota_aluno2 = scanner.nextDouble();

        double media = nota_aluno1 + nota_aluno2 / 2;

        if (media >= 7) {
            System.out.println("Aprovado !");
        } else {

            System.out.println("Digite a nota do Exame Final: ");
            double notaExameFinal = scanner.nextDouble();

            double mediaFinal = (media + notaExameFinal) / 2;

            if (mediaFinal >= 7) {
                System.out.println("Aprovado com nota fixa 6");
            } else {
                System.out.println("Reprovado");

            }
        }

        scanner.close();
    }
}
