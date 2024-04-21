package com.lista3_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma
        // empresa.
        // Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$
        // 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o
        // seu
        // salário total.

        System.out.println("Digite o valor do salario fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o valor das vendas: ");
        double valorVendas = scanner.nextDouble();
        double salarioTotal = 0;
        
        // Calcula o valor da comissão das vendas
        if(valorVendas <= 1500){
            salarioTotal = salarioFixo + (valorVendas * 0.03);
        }
        else{
            double valorVendas2 = valorVendas - 1500;
            salarioTotal = (salarioFixo) + (1500 * 0.03) + (valorVendas2 * 0.05);
        }
       
        // Exibe o salario total do funcionario
        System.out.println("O salario total e: " + salarioTotal);

        scanner.close();

    }
}
