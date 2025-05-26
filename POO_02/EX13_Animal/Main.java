package EX13_Animal;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Nome do animal: ");
        String nome = sc.nextLine();

        System.out.print("Espécie do animal: ");
        String especie = sc.nextLine();

        Animal animal = new Animal(nome, especie);

        int opcao;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Ver status");
            System.out.println("2 - Alterar nome");
            System.out.println("3 - Alterar espécie");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa buffer

            switch (opcao) {
                case 1 -> animal.status();
                case 2 -> {
                    System.out.print("Novo nome: ");
                    animal.setNome(sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Nova espécie: ");
                    animal.setEspecie(sc.nextLine());
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
    }
}
