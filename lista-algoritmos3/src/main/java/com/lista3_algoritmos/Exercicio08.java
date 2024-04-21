package com.lista3_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um caractere maiúsculo de A a Z: ");
        char maiusculo = scanner.next().charAt(0);
        int diferenca = 'a' - 'A'; // diferença entre maiúsculo e minúsculo na tabela ASCII
        char minusculo = (char) (maiusculo + diferenca); //Converte na tabela o caractere minúsculo correspondente ao caractere maiúsculo lido e depois soma ambos
        System.out.println("O caractere minúsculo correspondente é: " + minusculo);

        scanner.close();
    }
}
