package EX15_Midia;


public class Musica extends Midia {

    private final String artista;
    private final String album;

    public Musica(String titulo, int duracao, String artista, String album) {
        super(titulo, duracao);
        this.artista = artista;
        this.album = album;
    }

    
    
}
