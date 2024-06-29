import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int contador = 0; 
        int maiorNumero = 0;

        // Escreva um programa que leia dois números pelo teclado e mostre todos os
        // números pares que estão no intervalo entre o menor e o maior número
        // informados pelo usuário.

        System.out.println("Escreva o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Escreva o segundo numero: ");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            contador = num2;
            maiorNumero = num1; 
        }
        else{
            contador = num1;
            maiorNumero = num2;
        }


        while(contador <= maiorNumero) {
            if(contador % 2 == 0){
                System.out.println("Os numeros pares no intervalo entre o maior e o menor numero são: " + contador );
            }
            contador++;
        }

        scanner.close();
    }
}
