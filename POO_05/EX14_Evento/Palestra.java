package EX14_Evento;


public class Palestra extends Evento{

    private final String palestra;

    public Palestra(String nome, String data,String palestra) {
        super(nome, data);
        this.palestra = palestra;
    }

    public String getPalestra() {
        return palestra;
    }
    
}
