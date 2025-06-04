package EX11_Produtos;

public class Roupa extends Produtos {

    private final String tamanho;

    public Roupa(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Tamanho: " + tamanho);
    }

}
