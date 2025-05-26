package EX14_Casa;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Número da casa: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Cor da casa: ");
        String cor = sc.nextLine();

        System.out.print("Nome do proprietário: ");
        String nome = sc.nextLine();

        System.out.print("Idade do proprietário: ");
        int idade = sc.nextInt();

        System.out.print("Altura do proprietário: ");
        double altura = sc.nextDouble();

        Pessoa proprietario = new Pessoa(nome, idade, altura);
        Casa casa = new Casa(numero, cor, proprietario);

        int opcao;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Ver status");
            System.out.println("2 - Alterar número");
            System.out.println("3 - Alterar cor");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> casa.status();
                case 2 -> {
                    System.out.print("Novo número: ");
                    casa.setNumero(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Nova cor: ");
                    casa.setCor(sc.nextLine());
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
    }
}
