import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
  // static int fatorial(int n){
  // if(n == 1){
  // return 1;
  // }
  // else{
  // return n * fatorial(n-1);
  // }
  // }
  // int fatorialNumeroDigitado = fatorial(numeroDigitado);
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    // 2. Escreva um programa que leia um número inteiro positivo e calcule o seu
    // fatorial.

    System.out.println("Digite um numero inteiro positivo: ");

    // Variavel que armazena o numero que o usuario vai digitar
    int numeroDigitado = scanner.nextInt();

    // Variavel que controla o fatorial do numero + chamada da função

    int fatorial = 1;

    for (int i = 2; i <= numeroDigitado; i++) {
      fatorial *= i;
    }

    System.out.println("Fatorial de " + numeroDigitado + " é: " + fatorial);

    scanner.close();
  }
}
