
package ExerciciosJava;

import java.util.Scanner;

public class EX_E1 {
    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
                
                    System.out.print("Faca a conversao de REAIS para DOLAR: ");
                    double valor = teclado.nextDouble();
                    
                   double dinheiro = (valor*0.18348);
                            
                    System.out.print("Em dolar fica: U$ "+ String.format("%.2f", dinheiro));   
}
}