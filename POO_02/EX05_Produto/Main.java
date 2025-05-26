package EX05_Produto;

import java.util.Scanner;


public class Main {

public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Informe o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Informe o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Informe a quantidade em estoque: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        int opcao;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Ver status");
            System.out.println("2 - Comprar produto");
            System.out.println("3 - Atualizar estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1 -> produto.status();
                case 2 -> {
                    System.out.print("Informe a quantidade a comprar: ");
                    int qtd = sc.nextInt();
                    produto.comprar(qtd);
                }
                case 3 -> {
                    System.out.print("Nova quantidade em estoque: ");
                    int novoEstoque = sc.nextInt();
                    produto.setQuantidadeEmEstoque(novoEstoque);
                }
                case 0 -> System.out.println("Saindo do programa.");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
    }
}

