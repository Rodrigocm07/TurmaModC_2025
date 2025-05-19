package EX07_Livro;

import java.util.Scanner;


public class Main {
  
    public static void main(String[] args) {
    
        try (Scanner sc = new Scanner(System.in)) {
            Livro livro = new Livro();
            
            System.out.print("Digite o titulo do livro: ");
            livro.titulo = sc.nextLine();
            
            System.out.print("Digite o autor do livro: ");
            livro.Autor = sc.nextLine();
            
            System.out.print("Digite o ano de publicação: ");
            livro.anoPublicacao = sc.nextInt();
            
            livro.disponivel = true;
            
            System.out.println("## Informações do livro cadastrado ##");
            System.out.println("Titulo: "+livro.titulo);
            System.out.println("Autor: "+livro.Autor);
            System.out.println("Ano de publicação: "+livro.anoPublicacao);
            
            System.out.println("\n Deseja emprestar o livro? (s/n)");
            sc.nextLine();
            String opcao = sc.nextLine();
            
            if (opcao.equalsIgnoreCase("s")) {
                livro.emprestar();
            }
            System.out.println("\n Deseja devolver o livro? (s/n)");
            opcao = sc.nextLine();
            
            if (opcao.equalsIgnoreCase("s")) {
                livro.devolver();
            }
        }
    }
}
