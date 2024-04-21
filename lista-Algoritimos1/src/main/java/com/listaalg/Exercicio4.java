package com.listaalg;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {

   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

      // Declaração de variáveis
      int valorX = 0;
      int valorY = 0;
      int soma = 0;
      int menor = 0;
      int maior = 0;

      // Entrada e leitura de dados do usuário
      System.out.println("Entre com o primeiro valor: ");
      valorX = entrada.nextInt();

      System.out.println("Entre com o segundo valor: ");
      valorY = entrada.nextInt();

      if (valorX < valorY) {
         menor = valorX;
         maior = valorY;
      } else {
         maior = valorX;
         menor = valorY;
      }
      System.out.println("O valor do menor é: " + menor);
      System.out.println("O valor do maior é: " + maior);

      // Ajuste para incluir os números X e Y se forem ímpares

      // Cálculo da soma dos números ímpares entre X e Y
      while (menor < maior) {
         System.out.println(menor);
         if (menor % 2 == 1) {
            soma += menor;
         }
         menor++;
      }

      System.out.println("A soma dos números ímpares entre " + valorX + " e " + valorY + " é: " + soma);

      entrada.close();
   }
}
