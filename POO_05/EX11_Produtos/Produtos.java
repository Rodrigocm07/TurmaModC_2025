package EX11_Produtos;


public class Produtos {

    private final String nome;
    private final double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public void exibirInfo() {
        System.out.println("Nome: "+nome);
        System.out.println("Preço: "+preco);
    }
}
