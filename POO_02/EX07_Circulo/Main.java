package EX07_Circulo;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Informe o raio do círculo: ");
        double raio = sc.nextDouble();

        Circulo circulo = new Circulo(raio);

        int opcao;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Ver status");
            System.out.println("2 - Atualizar raio");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    circulo.status();
                    break;
                case 2:
                    System.out.print("Novo raio: ");
                    double novoRaio = sc.nextDouble();
                    circulo.setRaio(novoRaio);
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
    }
}
