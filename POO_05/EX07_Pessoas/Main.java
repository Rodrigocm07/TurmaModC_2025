package EX07_Pessoas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int op;

            do {
                System.out.println("\n==== MENU ====");
                System.out.println("1 - Cadastrar Aluno");
                System.out.println("2 - Cadastrar Professor");
                System.out.println("3 - Cadastrar Funcionário");
                System.out.println("4 - Exibir todas as pessoas");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                op = sc.nextInt();
                sc.nextLine(); // limpa o buffer

                switch (op) {
                    case 1 -> {
                        System.out.print("Nome do aluno: ");
                        String nome = sc.nextLine();
                        System.out.print("Idade: ");
                        int idade = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Endereço: ");
                        String endereco = sc.nextLine();
                        System.out.print("Matrícula: ");
                        int matricula = sc.nextInt();
                        sc.nextLine();
                        pessoas.add(new Aluno(nome, idade, endereco, matricula));
                        System.out.println("🎓 Aluno cadastrado com sucesso!");
                    }

                    case 2 -> {
                        System.out.print("Nome do professor: ");
                        String nome = sc.nextLine();
                        System.out.print("Idade: ");
                        int idade = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Endereço: ");
                        String endereco = sc.nextLine();
                        System.out.print("Disciplina: ");
                        String disciplina = sc.nextLine();
                        pessoas.add(new Professor(nome, idade, endereco, disciplina));
                        System.out.println("👨‍🏫 Professor cadastrado com sucesso!");
                    }

                    case 3 -> {
                        System.out.print("Nome do funcionário: ");
                        String nome = sc.nextLine();
                        System.out.print("Idade: ");
                        int idade = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Endereço: ");
                        String endereco = sc.nextLine();
                        System.out.print("Cargo: ");
                        String cargo = sc.nextLine();
                        pessoas.add(new Funcionario(nome, idade, endereco, cargo));
                        System.out.println("🧑‍💼 Funcionário cadastrado com sucesso!");
                    }

                    case 4 -> {
                        if (pessoas.isEmpty()) {
                            System.out.println("Nenhuma pessoa cadastrada.");
                        } else {
                            System.out.println("\n=== PESSOAS CADASTRADAS ===");
                            for (Pessoa p : pessoas) {
                                System.out.println("--------------");
                                p.exibirInfo();
                            }
                        }
                    }

                    case 0 ->
                        System.out.println("Encerrando o programa...");
                    default ->
                        System.out.println("Opção inválida.");
                }

            } while (op != 0);
        }
    }
}
