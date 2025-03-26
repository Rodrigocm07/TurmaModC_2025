package ExerciciosJava6;

import java.util.Scanner;

public class EX_B6 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            
            int menu;
            do {
                System.out.println("======================");
                System.out.println("      CALENDARIO      ");
                System.out.println("======================");
                System.out.println("[1] Domingo          ");
                System.out.println("[2] Segunda-feira    ");
                System.out.println("[3] Terça-feira      ");
                System.out.println("[4] Quarta-feira     ");
                System.out.println("[5] Quinta-feira     ");
                System.out.println("[6] Sexta-feira      ");
                System.out.println("[7] Sabado           ");
                System.out.println("[8] Sair             ");
                System.out.print("Escolha uma opção: ");
                menu = teclado.nextInt();
                
                    switch (menu) {
                        case 1:
                            System.out.println("\nDomigo é dia 09");
                            break;
                            
                        case 2:
                            System.out.println("\nSegunda-feira é dia 10");
                            break;
                            
                        case 3:
                            System.out.println("\nTerça-feira é dia 11");
                            break;
                            
                        case 4:
                            System.out.println("\nQuarta-feira é dia 12");
                            break;
                        
                        case 5:
                            System.out.println("\nQuinta-feira é dia 13");
                            break;
                        
                        case 6:
                            System.out.println("\nSexta-feira é dia 14");
                            break;
                        
                        case 7:
                            System.out.println("\nSabado é dia 15");
                            
                        case 8:
                            System.out.println("\nSaindo do sistema...");
                            break;
                            
                        default:
                            System.out.println("Opção invalida!");
                            break;              
                }
                
            } while (menu != 8);
        }
    }
}
