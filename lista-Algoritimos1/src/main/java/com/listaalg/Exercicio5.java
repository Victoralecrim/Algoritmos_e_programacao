package com.listaalg;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Informe o primeiro valor real: ");
        double a = Double.parseDouble(entrada.next());
        System.out.println("Informe o segundo valor real: ");
        double b = Double.parseDouble(entrada.next());
        System.out.println("Informe o terceiro valor real: ");
        double c = Double.parseDouble(entrada.next());
    
        if (a < b + c && b < a + c && c < a + b) {
          if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("O triângulo é retangulo");
          }
          if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("O triângulo é obtusangulo");
          }
          if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("O triângulo é Acutangulo");
          }
          if (a == b && b == c) {
            System.out.println("O triângulo é Equilatero");
          }
          if (a == b && a != c) {
            System.out.println("O triângulo é Isosceles");
          }
        }
        entrada.close();
    }
    
}
