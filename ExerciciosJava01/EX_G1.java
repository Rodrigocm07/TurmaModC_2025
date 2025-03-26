
package ExerciciosJava;

import java.util.Scanner;


public class EX_G1 {
    public static void main(String[] args) {
        
                        Scanner teclado = new Scanner(System.in);
                        
                        System.out.print("Digite o valor da compra: ");
                        double dinheiro = teclado.nextInt();
                        
                        double desconto = (dinheiro * 0.05);
                        double resultado = (dinheiro - desconto);
                        
                        System.out.println("Com o desconto fica R$" + String.format("%.2f",resultado ));
    }
  
}
