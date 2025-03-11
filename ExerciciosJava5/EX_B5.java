package ExerciciosJava5;

import java.util.Scanner;


public class EX_B5 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int senha = 0;
       
        while (senha != 12345){
          
        System.out.print("Digite sua senha: ");
        senha = teclado.nextInt();  
         if (senha == 12345){
                System.out.println("\nSenha correta!");
        }
            if (senha != 12345){
            System.out.println("\nSenha incorreta!");    
            }
    }
}
}    

