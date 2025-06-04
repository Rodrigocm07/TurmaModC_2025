package EX15_Midia;


public class Filme extends Midia {

    private final String diretor;
    private final String genero;
    
    public Filme(String titulo, int duracao, String diretor, String genero) {
        super(titulo, duracao);
        this.diretor = diretor;
        this.genero = genero;
    }

}
