package EX15_Midia;


public class Jogo extends Midia {

    private final String plataforma;
    private final int classificacao;
    
    public Jogo(String titulo, int duracao, String plataforma, int classificacao) {
        super(titulo, duracao);
        this.plataforma = plataforma;
        this.classificacao = classificacao;
    }
}
