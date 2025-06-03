package EX02_Animais;


public class Repteis extends Animais {

    private final String Escama;

    public Repteis(String nome, int idade, String Escama) {
        super(nome, idade);
        this.Escama = Escama;
    }
    
       @Override
    public void exibirInfo() {
        super.exibirInfo(); 
        System.out.println("Tipo de pelo: " + Escama);
    }
    
}
