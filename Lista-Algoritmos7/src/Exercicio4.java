import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        /*
         * cria um novo objeto StringBuilder com a palavra digitada, inverte essa
         * palavra (método reverse()) e então converte o StringBuilder de volta para uma
         * string (método toString()), resultando na palavra invertida
         */
        String palavraAoContrario = new StringBuilder(palavra).reverse().toString();

        /*
         * verifica se a palavra digitada é igual à sua versão invertida, ignorando
         * diferenças entre maiúsculas e minúsculas (método equalsIgnoreCase()).
         */
        
        if (palavra.equalsIgnoreCase(palavraAoContrario)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
        scanner.close();
    }
}
