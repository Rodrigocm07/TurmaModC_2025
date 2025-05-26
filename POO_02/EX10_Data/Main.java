package EX10_Data;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Informe o dia: ");
        int dia = sc.nextInt();

        System.out.print("Informe o mês: ");
        int mes = sc.nextInt();

        System.out.print("Informe o ano: ");
        int ano = sc.nextInt();

        Data data = new Data(dia, mes, ano);

        int opcao;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Ver data formatada");
            System.out.println("2 - Atualizar dia");
            System.out.println("3 - Atualizar mês");
            System.out.println("4 - Atualizar ano");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> data.status();
                case 2 -> {
                    System.out.print("Novo dia: ");
                    data.setDia(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Novo mês: ");
                    data.setMes(sc.nextInt());
                }
                case 4 -> {
                    System.out.print("Novo ano: ");
                    data.setAno(sc.nextInt());
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
    }
}
