package ExerciciosJava5_1;

import java.util.Scanner;


public class EX_D5_1 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int menu;
            do {
                System.out.println("============================");
                System.out.println("           MENU             ");
                System.out.println("============================");
                System.out.println("1 - Cadastrar");
                System.out.println("2- Consultar ");
                System.out.println("3 - Sair     ");
                
                menu = teclado.nextInt();
                if (menu == 1){
                    System.out.println("\nCADASTRO REALIZADO");
                    
                }else if (menu == 2){
                    System.out.println("\nCONSULTA FEITA");
                }else if (menu == 3){
                    System.out.println("\nEncerrando programa...");
                }else{
                    System.out.println("\nNumero invalido, digite novamente!");
                }
            }while (menu != 3);
        }
        
    }
}

