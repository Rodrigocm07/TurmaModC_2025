
package EX09_produto;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        produto p = new produto();
        
        System.out.print("Digite o nome do produto: ");
        p.nome = sc.nextLine();
        
        System.out.print("Digite o preço do produto: ");
        p.preco = sc.nextDouble();
        
        System.out.print("Digite a quantidade em estoque do produto: ");
        p.quantidadeEmEstoque = sc.nextInt();
        
        System.out.println(" ======= PRODUTO ======= ");
        System.out.println("nome: "+p.nome);
        System.out.println("preço: "+p.preco);
        System.out.println("quantidade: "+p.quantidadeEmEstoque);
        
        System.out.print("\nDigite a quantidade que deseja vender: ");
        int novaQuantidade = p.vender(sc.nextInt());
        System.out.println("Estoque após venda: " + novaQuantidade);
        
        System.out.print("\nDigite a quantidade que deseja repor: ");
        int repor = p.reporEstoque(sc.nextInt());
        System.out.println("Estoque após reposição: " + repor);
    }
}
