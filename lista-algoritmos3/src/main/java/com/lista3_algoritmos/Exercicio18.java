package com.lista3_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // Escrever um programa que peça dois valores inteiros e imprima o menu com as
        // opções: soma, diferença, produto, divisão, o resto da divisão, a potência (de
        // um
        // pelo outro) e a raiz quadrada de cada número lido. Vale lembrar que na
        // divisão
        // deve-se evitar o denominador zero

        // 1- Criar duas variaveis e ler seus valores inteiros
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 2- criar e imprimir o menu com as opções escolhidas pelo usuario soma,
        // diferença, produto, divisão, o resto da divisão, a potência (de um
        // pelo outro) e a raiz quadrada de cada número lido:

        // Exibindo o menu de opções
        System.out.println("Escolha uma opção:");
        System.out.println("1. Soma");
        System.out.println("2. Diferença");
        System.out.println("3. Produto");
        System.out.println("4. Divisão");
        System.out.println("5. Resto da divisão");
        System.out.println("6. Potência");
        System.out.println("7. Raiz quadrada");

        // Leitura da opção escolhida pelo usuário
        System.out.print("Digite o número da opção desejada: ");
        int opcao = scanner.nextInt();

        // 3-Realizar a operação conforme escolha do usuario
        switch (opcao) {
            case 1:
                System.out.println("Soma: " + (a + b));
                break;
            case 2:
                System.out.println("Subtração: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplicação: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Divisão: " + ((double) a / b));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            case 5:
                if (b != 0) {
                    System.out.println("Resto da divisão: " + (a % b));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            case 6:
                System.out.println("Potência: " + Math.pow(a, b));
                break;
            case 7:
                if (a >= 0 && b % 2 == 0) {
                    System.out.println("Raiz quadrada de " + a + ": " + Math.sqrt(a));
                    System.out.println("Raiz quadrada de " + b + ": " + Math.sqrt(b));
                } else {
                    System.out.println("Não é possível calcular a raiz quadrada de números negativos ou ímpares.");
                }
                break;

            default:
                break;
        }

        scanner.close();
    }
}
