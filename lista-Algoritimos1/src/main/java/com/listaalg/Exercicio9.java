package com.listaalg;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio9 {

   public class DecimalParaHexadecimal {
      public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         // Entrada do usuário
         int numeroDecimal = scanner.nextInt();

         // Chamada do método para converter e imprimir o resultado
         decimalParaHexadecimal(numeroDecimal);
         scanner.close();
      }

      // Método para converter decimal para hexadecimal e imprimir o resultado
      public static void decimalParaHexadecimal(int numeroDecimal) {
         // Usando o método Integer.toHexString para converter decimal para hexadecimal
         String hexadecimal = Integer.toHexString(numeroDecimal).toUpperCase();
         // Imprime o resultado
         System.out.println(hexadecimal);
      }

   }

}
