package EX02_Animais;

public class Aves extends Animais {

    private final String Envergadura;

    public Aves(String nome, int idade, String Envergadura) {
        super(nome, idade);
        this.Envergadura = Envergadura;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo de pelo: " + Envergadura);
    }
}
