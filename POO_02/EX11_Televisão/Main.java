package EX11_Televisão;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Volume inicial: ");
        int volume = sc.nextInt();

        System.out.print("Canal inicial: ");
        int canal = sc.nextInt();

        Televisao tv = new Televisao(volume, canal);

        int opcao;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Ver status");
            System.out.println("2 - Aumentar volume");
            System.out.println("3 - Diminuir volume");
            System.out.println("4 - Trocar canal");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> tv.status();
                case 2 -> tv.aumentarVolume();
                case 3 -> tv.diminuirVolume();
                case 4 -> {
                    System.out.print("Novo canal: ");
                    tv.trocarCanal(sc.nextInt());
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
    }
}
