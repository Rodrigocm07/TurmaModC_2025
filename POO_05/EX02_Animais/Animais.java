package EX02_Animais;


public class Animais {
    
    private final String nome;
    private final int idade;

    public Animais(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    
    public void exibirInfo() {
        System.out.println("Nome do animal: "+nome);
        System.out.println("Idade do animal: "+idade);
    }
}
