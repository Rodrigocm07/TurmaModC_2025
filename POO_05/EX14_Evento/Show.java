package EX14_Evento;


public class Show extends Evento{

    private final String artista;

    public Show(String nome, String data, String artista) {
        super(nome, data);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }
    
    
    
}

