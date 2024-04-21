package com.lista3_algoritmos;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Ler o nome de 2 times e o número de gols marcados na partida (para cada
        // time).
        // Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a
        // palavra EMPATE.

        // Lendo o nome do primeiro time
        System.out.println("Digite o nome do primeiro time: ");
        String time1 = scanner.nextLine();

        System.out.println("Digite o numero de gols marcados pelo " + time1 + ": ");
        int numeroGolsTime1 = scanner.nextInt();

        // Ler o nome do segundo time
        System.out.println("Digite o nome do segundo time: ");
        String time2 = scanner.nextLine();

        System.out.println("Digite o numero de gols marcados pelo " + time2 + ": ");
        int numeroGolsTime2 = scanner.nextInt();

        if (numeroGolsTime1 > numeroGolsTime2) {
            System.out.println("O vencedor é : " + time1);
        } else {

            if (numeroGolsTime2 > numeroGolsTime1) {
                System.out.println("O vencedor é : " + time2);
            }

            else {
                System.out.println("Impate");
            }
        }

        scanner.close();
    }
}
