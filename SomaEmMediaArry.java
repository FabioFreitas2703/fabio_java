
import java.util.Scanner;

public class SomaEmMediaArry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;
        double media;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + "º ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        media = (double) soma / numeros.length;

        System.out.println("");
        System.out.println("A soma dos numeros:" + soma);
        System.out.println("A media dos numeros:" + media);

        scanner.close();
    }

}
