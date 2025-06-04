package EX11_Produtos;

public class Eletronico extends Produtos {

    private final int voltagem;

    public Eletronico(String nome, double preco, int voltagem) {
        super(nome, preco);
        this.voltagem = voltagem;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Voltagem: " + voltagem);
    }

}
