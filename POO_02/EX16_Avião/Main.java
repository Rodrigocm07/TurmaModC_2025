package EX16_Avião;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Modelo do avião: ");
        String modelo = sc.nextLine();

        System.out.print("Capacidade de passageiros: ");
        int capacidade = sc.nextInt();

        System.out.print("Velocidade máxima: ");
        double velocidade = sc.nextDouble();

        Aviao aviao = new Aviao(modelo, capacidade, velocidade);

        int opcao;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Ver status");
            System.out.println("2 - Alterar modelo");
            System.out.println("3 - Alterar capacidade");
            System.out.println("4 - Alterar velocidade máxima");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> aviao.status();
                case 2 -> {
                    System.out.print("Novo modelo: ");
                    aviao.setModelo(sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Nova capacidade: ");
                    aviao.setCapacidadePassageiros(sc.nextInt());
                }
                case 4 -> {
                    System.out.print("Nova velocidade máxima: ");
                    aviao.setVelocidadeMaxima(sc.nextDouble());
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
    }
}
