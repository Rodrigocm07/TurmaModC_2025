package EX02_Animais;

public class Mamiferos extends Animais {

    private final String TipoPelo;

    public Mamiferos(String nome, int idade,String TipoPelo) {
        super(nome, idade);
        this.TipoPelo = TipoPelo;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); 
        System.out.println("Tipo de pelo: " + TipoPelo);
    }
}
