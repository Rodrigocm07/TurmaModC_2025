package EX08_Jogos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int op;
            
            do {
                System.out.println("\n==== MENU ====");
                System.out.println("1 - Jogar Tabuleiro");
                System.out.println("2 - Jogar Cartas");
                System.out.println("3 - Jogar Video Game");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                op = sc.nextInt();
                
                Jogo jogo = null;
                
                switch (op) {
                    case 1 -> jogo = new JogoTabuleiro();
                    case 2 -> jogo = new JogoCartas();
                    case 3 -> jogo = new JogoVideoGame();
                    case 0 -> System.out.println("Encerrando jogo...");
                    default -> System.out.println("Opção inválida.");
                }
                
                if (jogo != null) {
                    jogo.jogar();
                }
                
            } while (op != 0);
        }
    }
}

