
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma patavra: ");
        String palavra =scanner.nextLine();

        char[] arrayDeCaracteres = palavra.toCharArray();

        boolean ehPalindromo = true;
        int tamanho = arrayDeCaracteres.length;

        for (int i = 0; i < tamanho/2; i++) {
            if(arrayDeCaracteres[i] != arrayDeCaracteres[tamanho -1 -i]){
                ehPalindromo = false;
                break;
            }
        }
        if (ehPalindromo) {
            System.out.println("a palavra é "+ palavra +" palindromo");
        }else{

            System.out.println("Não uma palavra "+ palavra +" palindromo");

        }

        scanner.close();



    }
}
