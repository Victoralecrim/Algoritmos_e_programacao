package com.listaalg;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro X (1 < X ≤ 107):");
        // Declarando o valor da variavel numero para a leitura
        int x = scanner.nextInt();
        //Variavel que controla se o numero é primo ou não
        var numeroPrimo = true;

        for (int i = 2; i <= Math.sqrt(x); i ++) {
            if (x % i == 0) {
                numeroPrimo = false;                
                break;
            }
        }

        if(numeroPrimo == true){
            System.out.println(x + " é primo");
        }
        else if(numeroPrimo == false){
            System.out.println(x + " não é primo");
        }

        scanner.close();

    }
}
