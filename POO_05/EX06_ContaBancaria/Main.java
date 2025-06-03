package EX06_ContaBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int op;
            
            do {
                System.out.println("\n==== MENU ====");
                System.out.println("1 - Cadastrar Conta Corrente");
                System.out.println("2 - Cadastrar Conta Poupança");
                System.out.println("3 - Cadastrar Conta Investimento");
                System.out.println("4 - Exibir todas as contas");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                op = sc.nextInt();
                sc.nextLine();
                
                switch (op) {
                    case 1 -> {
                        System.out.print("Número da conta: ");
                        String num = sc.nextLine();
                        System.out.print("Saldo: ");
                        double saldo = sc.nextDouble();
                        System.out.print("Limite: ");
                        double limite = sc.nextDouble();
                        contas.add(new ContaCorrente(num, saldo, limite));
                        System.out.println("🏦 Conta Corrente cadastrada!");
                    }
                    case 2 -> {
                        System.out.print("Número da conta: ");
                        String num = sc.nextLine();
                        System.out.print("Saldo: ");
                        double saldo = sc.nextDouble();
                        System.out.print("Taxa de juros (%): ");
                        double taxa = sc.nextDouble();
                        contas.add(new ContaPoupanca(num, saldo, taxa));
                        System.out.println("💰 Conta Poupança cadastrada!");
                    }
                    case 3 -> {
                        System.out.print("Número da conta: ");
                        String num = sc.nextLine();
                        System.out.print("Saldo: ");
                        double saldo = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Tipo de investimento: ");
                        String tipo = sc.nextLine();
                        contas.add(new ContaInvestimento(num, saldo, tipo));
                        System.out.println("📈 Conta Investimento cadastrada!");
                    }
                    case 4 -> {
                        if (contas.isEmpty()) {
                            System.out.println("Nenhuma conta cadastrada.");
                        } else {
                            System.out.println("\n=== CONTAS CADASTRADAS ===");
                            for (ContaBancaria c : contas) {
                                System.out.println("--------------");
                                c.exibirInfo();
                            }
                        }
                    }
                    case 0 -> System.out.println("Encerrando...");
                    default -> System.out.println("Opção inválida.");
                }
                
            } while (op != 0);
        }
    }
}
