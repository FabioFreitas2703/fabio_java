import java.util.ArrayList;
public class ExemploConjuntoLista {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa(primeiroNome, segundoNome));
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Daniel");
        nomes.add("Erica");

        nomes.set(1, "Lyra");


        for (int i = 0; i < nomes.size(); i++) {
            String nome = nomes.get(i);
            System.out.println(nome);
        }
    }
}
