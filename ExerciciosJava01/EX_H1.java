package ExerciciosJava;

import java.util.Scanner;

public class EX_H1 {
    public static void main(String[] args) {
     
    Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos quilometros voce andou com o carro? ");
         double km = teclado.nextInt();

         System.out.print("Quantos dias voce andou com o carro? ");
          double dias = teclado.nextInt();
          
          double aluguel1 = (km * 0.20);
          double aluguel2 = (dias * 90 );
          double total = (aluguel1 + aluguel2);
          
          System.out.println("O total ficou: R$ " + String.format("%.2f",total ));
    }
   
}
