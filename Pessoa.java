public class Pessoa {

    String primeiroNome;
    String segundoNome;

    public Pessoa(String primeiroNome, String segundoNome){
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
    }

    public String getNomeCompleto(){
        return this.primeiroNome + " " + this.segundoNome;
    }

}
