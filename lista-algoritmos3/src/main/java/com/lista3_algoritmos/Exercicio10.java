package com.lista3_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.println("Digite o numero de votos brancos: ");
        int votosNulos = scanner.nextInt();

        System.out.println("Digite o numero de votos brancos: ");
        int votosValidos = scanner.nextInt();

        // Variavel que representa o total de eleitores
        int totalEleitores = scanner.nextInt();

        // Calculo do total de eleitores
        totalEleitores = (votosBrancos + votosNulos + votosValidos) / totalEleitores;

        votosBrancos = (votosBrancos * 100) / totalEleitores;
        votosNulos = (votosNulos * 100) / totalEleitores;
        votosValidos = (votosValidos * 100) / totalEleitores;

        System.out.println("A porcentagem de eleitores é igual a : " + " Votos brancos = " + votosBrancos + "%" + " Votos nulos = " + votosNulos + "%" + " Votos validos = " + votosValidos + "%");

        scanner.close();
    }
}
