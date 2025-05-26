package EX15_Empregado;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Nome do empregado: ");
        String nome = sc.nextLine();

        System.out.print("Cargo: ");
        String cargo = sc.nextLine();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        Empregado empregado = new Empregado(nome, cargo, salario);

        int opcao;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Ver status");
            System.out.println("2 - Alterar nome");
            System.out.println("3 - Alterar cargo");
            System.out.println("4 - Alterar salário");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> empregado.status();
                case 2 -> {
                    System.out.print("Novo nome: ");
                    empregado.setNome(sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Novo cargo: ");
                    empregado.setCargo(sc.nextLine());
                }
                case 4 -> {
                    System.out.print("Novo salário: ");
                    empregado.setSalario(sc.nextDouble());
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
    }
}
