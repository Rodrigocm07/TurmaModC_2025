package EX11_Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produtos> produtos = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int op;
            
            do {
                System.out.println("\n==== MENU ====");
                System.out.println("1 - Cadastrar Livro");
                System.out.println("2 - Cadastrar Eletrônico");
                System.out.println("3 - Cadastrar Roupa");
                System.out.println("4 - Exibir todos os produtos");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                op = sc.nextInt();
                sc.nextLine(); // limpa o buffer
                
                switch (op) {
                    case 1 -> {
                        System.out.print("Nome do livro: ");
                        String nome = sc.nextLine();
                        System.out.print("Preço: ");
                        double preco = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Autor: ");
                        String autor = sc.nextLine();
                        System.out.print("ISBN: ");
                        int isbn = sc.nextInt();
                        sc.nextLine();
                        produtos.add(new Livro(nome, preco, autor, isbn));
                        System.out.println("📚 Livro cadastrado com sucesso!");
                    }
                    
                    case 2 -> {
                        System.out.print("Nome do eletrônico: ");
                        String nome = sc.nextLine();
                        System.out.print("Preço: ");
                        double preco = sc.nextDouble();
                        System.out.print("Voltagem (110 ou 220): ");
                        int voltagem = sc.nextInt();
                        sc.nextLine();
                        produtos.add(new Eletronico(nome, preco, voltagem));
                        System.out.println("🔌 Eletrônico cadastrado com sucesso!");
                    }
                    
                    case 3 -> {
                        System.out.print("Nome da roupa: ");
                        String nome = sc.nextLine();
                        System.out.print("Preço: ");
                        double preco = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Tamanho (P/M/G): ");
                        String tamanho = sc.nextLine();
                        produtos.add(new Roupa(nome, preco, tamanho));
                        System.out.println("👕 Roupa cadastrada com sucesso!");
                    }
                    
                    case 4 -> {
                        if (produtos.isEmpty()) {
                            System.out.println("Nenhum produto cadastrado.");
                        } else {
                            System.out.println("\n=== PRODUTOS CADASTRADOS ===");
                            for (Produtos p : produtos) {
                                System.out.println("--------------");
                                p.exibirInfo();
                            }
                        }
                    }
                    
                    case 0 -> System.out.println("Encerrando programa...");
                    default -> System.out.println("Opção inválida.");
                }
                
            } while (op != 0);
        }
    }
}
