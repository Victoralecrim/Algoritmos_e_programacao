import java.util.Scanner;
import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // 1) Escreva um programa em Java que leia dois valores e calcule o valor a ser
        // mostrado na tela seguindo a seguinte lógica:

        // Caso um dos valores lidos seja pelo menos o dobro do outro valor, o valor
        // final deve ser o resto da divisão do maior pelo menor valor.
        // Do contrário, imprima o produto entre os dois valores lidos.

        //Escrever os valores na tela 
        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextInt();
        
        double valor_final;
        double valor_final2;
        
        if(valor1 >= 2 * valor2 || valor2 >= 2 * valor1){
           valor_final = valor1 % valor2;
           System.out.println("O valor final do resto da divisão entre os dois valores é: " + valor_final);
        }
        else{
            valor_final2 = valor1 * valor2;
            System.out.println("O valor final do resto da multiplicação entre os dois valores é: " + valor_final2);
        }
        

        scanner.close();
    }
}
