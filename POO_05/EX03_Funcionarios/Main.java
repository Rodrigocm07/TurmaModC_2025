package EX03_Funcionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionarios> funcionarios = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int op;
            
            do {
                System.out.println("\n==== Menu ====");
                System.out.println("1 - Cadastrar Gerente");
                System.out.println("2 - Cadastrar Vendedor");
                System.out.println("3 - Cadastrar Desenvolvedor");
                System.out.println("4 - Exibir todos os funcionários");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                op = sc.nextInt();
                sc.nextLine(); 
                
                switch (op) {
                    case 1 -> {
                        System.out.print("Nome do gerente: ");
                        String nome = sc.nextLine();
                        System.out.print("Salário: ");
                        double salario = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Cargo: ");
                        String cargo = sc.nextLine();
                        System.out.print("Departamento: ");
                        String departamento = sc.nextLine();
                        funcionarios.add(new Gerente(nome, salario, cargo, departamento));
                        System.out.println("👔 Gerente cadastrado com sucesso!");
                    }
                    
                    case 2 -> {
                        System.out.print("Nome do vendedor: ");
                        String nome = sc.nextLine();
                        System.out.print("Salário: ");
                        double salario = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Cargo: ");
                        String cargo = sc.nextLine();
                        System.out.print("Comissão: ");
                        double comissao = sc.nextDouble();
                        sc.nextLine();
                        funcionarios.add(new Vendedor(nome, salario, cargo, comissao));
                        System.out.println("💼 Vendedor cadastrado com sucesso!");
                    }
                    
                    case 3 -> {
                        System.out.print("Nome do desenvolvedor: ");
                        String nome = sc.nextLine();
                        System.out.print("Salário: ");
                        double salario = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Cargo: ");
                        String cargo = sc.nextLine();
                        System.out.print("Linguagem de programação: ");
                        String linguagem = sc.nextLine();
                        funcionarios.add(new Desenvolvedor(nome, salario, cargo, linguagem));
                        System.out.println("💻 Desenvolvedor cadastrado com sucesso!");
                    }
                    
                    case 4 -> {
                        if (funcionarios.isEmpty()) {
                            System.out.println("Nenhum funcionário cadastrado.");
                        } else {
                            System.out.println("\n=== FUNCIONÁRIOS CADASTRADOS ===");
                            for (Funcionarios f : funcionarios) {
                                System.out.println("--------------");
                                f.exibirInfo();
                            }
                        }
                    }
                    
                    case 0 -> System.out.println("Encerrando programa...");
                    default -> System.out.println("Opção inválida!");
                }
                
            } while (op != 0);
        }
    }
}
