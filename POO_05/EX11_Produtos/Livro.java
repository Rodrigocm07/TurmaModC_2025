package EX11_Produtos;

public class Livro extends Produtos {

    private final String autor;
    private final int ISBN;

    public Livro(String nome, double preco, String autor, int ISBN) {
        super(nome, preco);
        this.autor = autor;
        this.ISBN = ISBN;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
    }

}
