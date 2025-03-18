
package ExerciciosJava;

import java.util.Scanner;


public class EX_L1 {
    public static void main(String[] args) {
        
     Scanner teclado = new Scanner(System.in);
     
        System.out.print("Qual o nome do aluno? ");
                String nome = teclado.nextLine();
             
        System.out.print("Qual eh a primeira nota? ");
                int nota1 = teclado.nextInt();
          
        System.out.print("Qual eh a segunda nota? ");
                int nota2 = teclado.nextInt();
                
                int media = (nota1 + nota2) / 2;
                
                if(media >= 7) {
                    
        System.out.print(nome + ", voce foi aprovado! Sua media foi "+ media);
        
                }else{
        
        System.out.print(nome + ", voce foi REPROVADO! ");
   
                } 
    }
  
}
