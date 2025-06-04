package EX14_Evento;

public class Workshop extends Evento {

    private final String tema;

    public Workshop(String nome, String data, String tema) {
        super(nome, data);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

}
