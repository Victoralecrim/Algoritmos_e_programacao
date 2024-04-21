package com.lista3_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("\nQuestão 06:");
        System.out.print("Digite uma medida de tempo em segundos: ");
        int tempoSegundos = scanner.nextInt();
        int horas = tempoSegundos / 3600;
        int minutos = (tempoSegundos % 3600) / 60;
        int segundos = tempoSegundos % 60;
        System.out.println("O tempo em horas, minutos e segundos é: " + horas + "h " + minutos + "m " + segundos + "s");

        scanner.close();
    }
}
