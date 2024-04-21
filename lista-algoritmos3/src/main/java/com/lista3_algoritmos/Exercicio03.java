package com.lista3_algoritmos;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nQuestão 03:");
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();
        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;
        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius);

        scanner.close();
    }
}
