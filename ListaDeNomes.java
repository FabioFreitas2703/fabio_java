import java.util.Scanner;
import java.util.ArrayList;

public class ListaDeNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaNomes = new ArrayList<>();

        System.out.println("Digite um nome: ");

        int opcao;
        while (opcao != 5) {
            System.out.println("Escolha uma das opçoes: ");
            System.out.println("opçoes 1 para adicionar : ");
            System.out.println("opçoes 2 excluir: ");
            System.out.println("opçoes 3 : ");
            System.out.println("opçoes 4: ");
            System.out.println("opçoes5 : ");
        }

        System.out.println("\nNomes inseridos:");
        for (String nomeInserido : listaNomes) {
            System.out.println(nomeInserido);
        }

        scanner.close();

    }
}
