package com.lista3_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Escrever um programa para ler a quantidade de horas-aula dadas de dois
        // professores e o valor por hora recebido por cada um(valores diferentes pois
        // um
        // deles é mestre e o outro é doutor). Mostrar na tela qual dos professores
        // tem
        // salário total maior.

        // Criando as variaveis de horas-aula de cada um
        // Leitura da quantidade de horas-aula e do valor por hora de cada professor
        System.out.print("Digite a quantidade de horas-aula dadas pelo primeiro professor: ");
        double horasAulasProf1 = scanner.nextDouble();

        // Criando as variaveis de calculo das horas-aula do primeiro professor
        System.out.print("Digite o valor de horas-aula do primeiro professor: ");
        double valorHoraAulasProf1 = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas-aula dadas pelo segundo professor: ");
        double horasAulasProf2 = scanner.nextDouble();

        System.out.print("Digite o valor de horas-aula do segundo professor: ");
        double valorHoraAulasProf2 = scanner.nextDouble();

        // Fazendo o calculo horas-aula de cada professor
        double pagamentoHoraAula1prof1 = horasAulasProf1 * valorHoraAulasProf1;
        double pagamentoHoraAula1prof2 = horasAulasProf2 * valorHoraAulasProf2;

        // Exibindo o pagamento de cada professor
        System.out.println("O pagamento do primeiro professor é: R$ " + pagamentoHoraAula1prof1);
        System.out.println("O pagamento do segundo professor é: R$ " + pagamentoHoraAula1prof2);

        scanner.close();
    }
}
