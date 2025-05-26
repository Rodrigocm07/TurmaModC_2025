package EX04_livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o título: ");
            String titulo = sc.nextLine();
            
            System.out.print("Digite o autor: ");
            String autor = sc.nextLine();
            
            System.out.print("Digite o ano de Publicação: ");
            int ano = sc.nextInt();
            
            Livro L = new Livro(titulo, autor, ano);
            
            int opcao;
            do {
                System.out.println("\nMenu do Livro:");
                System.out.println("\n1. Emprestar livro");
                System.out.println("2. Devolver livro");
                System.out.println("3. Ver informações");
                System.out.println("0. Sair");
                System.out.print("Escolha: ");
                opcao = sc.nextInt();
                
                switch(opcao) {
                    case 1 -> L.emprestar();
                    case 2 -> L.devolver();
                    case 3 -> L.status();
                    case 0 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida!");
                }
            } while(opcao != 0);
        }
    }
}
        
