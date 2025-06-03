package EX07_Pessoas;


public class Pessoa {

    private final String nome;
    private final int idade;
    private final String endereco;

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    public void exibirInfo() {
    
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Endereço: "+endereco);
    }
    
}
