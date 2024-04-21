package com.lista3_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o salario do funcionario : ");
        int salarioFuncionario = scanner.nextInt();

        //Variavel que representa o reajuste de salario
        int percentual_reajusteSalario = scanner.nextInt();

        //Variavel de calculo do novo salario a partir do reajuste 
        int novoSalario = scanner.nextInt();

        //Calculo do novo salario 
        novoSalario = (percentual_reajusteSalario * salarioFuncionario) / 100;
        
        System.out.println("O novo salario do funcionario com o reajuste é : " + novoSalario);

        scanner.close();
    }
}
