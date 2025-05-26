package EX06_Dispositivo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Televisao tv = new Televisao();
            int opcao;

            do {
                System.out.println("1 - Ligar TV\n2 - Desligar TV\n3 - Ver status\n0 - Sair");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1 -> tv.ligar();
                    case 2 -> tv.desligar();
                    case 3 -> System.out.println("\nStatus: " + tv.obterStatus()+("\n"));
                    case 0 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida!");
                }
            } while (opcao != 0); 
        }
    }
}


