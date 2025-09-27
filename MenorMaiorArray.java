
import java.util.Scanner;

public class MenorMaiorArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número" +(i + 1)  +"º :");
            numeros[i] = scanner.nextInt();
        }

        int maiorValor = numeros[0];
        int menorValor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menorValor) {
                menorValor = numeros[i];
            }
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
            }
        }
        System.out.println("O maior numero é: " + maiorValor);
        System.out.println("O menor numero é: " + menorValor);
    }
}