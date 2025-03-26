
package ExerciciosJava;

import java.util.Scanner;

public class EX_K1 {
    public static void main(String[] args) {
        
                Scanner teclado = new Scanner(System.in);
                
                  System.out.print("Em que ano voce nasceu? ");
                  int nasceu = teclado.nextInt();
                      
                  int idade = (2025 - nasceu);
                              
                  System.out.println("O seu direito de voto eh: "+ (idade >= 16));
    }
    
}
