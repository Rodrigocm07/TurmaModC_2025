package ExerciciosJava6;

import java.util.Scanner;

public class EX_D6 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            
            int menu;
            do {
                System.out.println("======================");
                System.out.println("      CALENDARIO      ");
                System.out.println("======================");
                System.out.println("[1] Refrigerante     ");
                System.out.println("[2] Água             ");
                System.out.println("[3] Suco             ");
                System.out.println("[4] Sair             ");
                System.out.print("Escolha uma opção: ");
                menu = teclado.nextInt();
                
                    switch (menu) {
                        case 1:
                            System.out.println("\nCoca-Cola - R$ 5,20\nPepsi - R$ 4,20\nCharrua R$ 3,50");
                            break;
                            
                        case 2:
                            System.out.println("\nÁgua - R$ 2,00");
                            break;
                            
                        case 3:
                            System.out.println("\nLaranja,Morango,Abacaxi - R$ 3,00");
                            break;
                            
                        case 4:
                            System.out.println("\nSaindo do programa...");
                            break;

                        default:
                            System.out.println("Opção invalida!");
                            break;              
                }
                
            } while (menu != 4);
        }
    }
}
