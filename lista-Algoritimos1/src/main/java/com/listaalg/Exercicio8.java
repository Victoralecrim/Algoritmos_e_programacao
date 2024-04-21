package com.listaalg;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor inteiro X ((1 ≤ X ≤ 108):");
        // Declarando o valor da variavel numero para a leitura
        int x = ler.nextInt();
        //Variavel que controla se o numero é primo ou não

        var somaDivisores = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                somaDivisores += i;
            }
        }

        if(somaDivisores == 1 || somaDivisores == x){
            System.out.println(x + " é perfeito");
        }
        else{
            System.out.println(x + " não é perfeito");
        }

        ler.close();
    }
}
