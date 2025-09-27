import java.util.Scanner;

public class InverterArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]numeros = new int[10];
        System.out.println("Voce Precisa inserir 10 numeros inteiros");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nNumero" + (i+1) + "º numero");
        }

        for(int i = numeros.length -1; i >=0; i--){
            System.out.println("numeros[i]");
        }

        scanner.close();

    }
}