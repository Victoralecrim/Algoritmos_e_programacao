package com.lista3_algoritmos;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nQuestão 05:");
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();
        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();
        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();
        int idadeEmDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("A idade em dias é: " + idadeEmDias);

        scanner.close();
    }
}
