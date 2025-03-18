
package ExerciciosJava;

import java.util.Scanner;


public class EX_F1 {
    public static void main(String[] args) {
        
                Scanner teclado = new Scanner(System.in);
            
                System.out.print("Qual a altura da parede? ");
                double altura = teclado.nextInt();
                
                System.out.print("Qual a largura da parede? ");
                double largura = teclado.nextInt();
                                               
                 double area = (altura*largura);
                 double tinta = (area / 2);
                                          
                System.out.println("A area da parede eh " + String.format("%.2f", area ) +" metros quadrados") ;

                System.out.println("Para que a perede seja toda pintada serao necessarios " + String.format("%.2f", tinta ) +" litros de tinta") ;
    }
    
}

