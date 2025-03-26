package ExerciciosJava4;

import java.util.Scanner;


public class EX_F4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um caractere: ");
        String caractere = teclado.nextLine();
        
        System.out.print("Digite quantas vezes deseja repitir: ");
        int numero = teclado.nextInt();
        
        for (int i = 1; i <= numero; i++) { 
            System.out.println(caractere);
        }
        
       
    }
}
