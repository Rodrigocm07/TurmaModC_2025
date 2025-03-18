
package ExerciciosJava;

import java.util.Scanner;


public class EX_A1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
                
     System.out.print("Qual é o seu nome? ");
     String nome = teclado.nextLine();
     
          System.out.print("Qual eh seu salario? ");
               int salario = teclado.nextInt();
               
              System.out.print("Ola! "+nome+" seu salario eh de "+salario+" reais");
    }
 
}
