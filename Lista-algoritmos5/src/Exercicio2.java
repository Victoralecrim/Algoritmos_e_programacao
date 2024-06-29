import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int contador = 0;
        int maiorValor = 0;
        int menorValor = 0;

        while(contador < 10){
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            if(numero < menorValor){
                menorValor = numero;
            }       
            if(numero > maiorValor){
                maiorValor = numero;
            }
            
            contador++;
        }

        System.out.println("O menor número é: " + menorValor);
        System.out.println("O maior número é: " + maiorValor);


        scanner.close();
    }
}
