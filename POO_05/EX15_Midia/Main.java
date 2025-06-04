package EX15_Midia;


public class Main {

    public static void main(String[] args) {
        
        Musica minhaMusica = new Musica("Bohemian Rhapsody",660,"Queen","Bohemian Rhapsody");
        Filme meuFilme = new Filme("Meu malvado favorito",148,"diretor do filme","animação");
        Jogo meuJogo = new Jogo("Castlevania: SOTN",660,"Multiplataforma",14);
        
        System.out.println(minhaMusica.getTitulo());
        System.out.println(meuFilme.getTitulo());
        System.out.println(meuJogo.getTitulo());
        
        
    }
    
}
