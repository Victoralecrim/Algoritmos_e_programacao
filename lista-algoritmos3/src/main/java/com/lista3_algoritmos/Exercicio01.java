package com.lista3_algoritmos;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questão 01
        System.out.println("Questão 01:");
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("O antecessor de " + numero + " é: " + (numero - 1));
        System.out.println("O sucessor de " + numero + " é: " + (numero + 1));
        
        
        scanner.close();
    }

}