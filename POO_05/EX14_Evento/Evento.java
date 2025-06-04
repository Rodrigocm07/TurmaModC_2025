package EX14_Evento;


public abstract class Evento {

    private final String nome, data;

    public Evento(String nome, String data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }
    
    
}
