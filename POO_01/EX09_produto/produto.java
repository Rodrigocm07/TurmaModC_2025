
package EX09_produto;


public class produto {

    String nome;
    double preco;
    int quantidadeEmEstoque;
    
    int vender(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            return quantidadeEmEstoque;
        } else {
            System.out.println("Quantidade indisponível em estoque");
            return -1; 
        }
    }
    
    int reporEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
        return quantidadeEmEstoque;
    }
}

