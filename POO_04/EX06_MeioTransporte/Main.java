package EX06_MeioTransporte;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Escolha: \n 1 - Carro \n2 - Avião \n3 - Navio");
            int op = sc.nextInt();
            MeioTransporte mt = null;

            switch (op) {
                case 1 -> mt = new Carro();
                case 2 -> mt = new Aviao();
                case 3 -> mt = new Navio();
                default -> System.out.println("Opção inválida.");
            }

            if (mt != null) {
                mt.mover();
            }
        }
    }
}

