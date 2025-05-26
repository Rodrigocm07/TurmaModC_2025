package EX06_Retangulo;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Informe a largura do retângulo: ");
        double largura = sc.nextDouble();

        System.out.print("Informe a altura do retângulo: ");
        double altura = sc.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        int opcao;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Ver status");
            System.out.println("2 - Atualizar largura");
            System.out.println("3 - Atualizar altura");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> retangulo.status();
                case 2 -> {
                    System.out.print("Nova largura: ");
                    double novaLargura = sc.nextDouble();
                    retangulo.setLargura(novaLargura);
                }
                case 3 -> {
                    System.out.print("Nova altura: ");
                    double novaAltura = sc.nextDouble();
                    retangulo.setAltura(novaAltura);
                }
                case 0 -> System.out.println("Saindo do programa.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
    }
}
