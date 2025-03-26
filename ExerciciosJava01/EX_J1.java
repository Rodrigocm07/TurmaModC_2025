package ExerciciosJava;

import java.util.Scanner;

public class EX_J1 {
    public static void main(String[] args) {
        
                    Scanner teclado = new Scanner(System.in);

                    System.out.print("Qual a velocidade? ");
                       double velocidade = teclado.nextInt();
                       
                       if (velocidade > 80){
                         double multa = (velocidade - 80)*5;
                          
                      System.out.println("Voce foi multado em: R$ " + String.format("%.2f",multa ));  
                      
                       }else{
                      
                           System.out.println("Voce nao foi multado.");
                       }
    }
    
}
