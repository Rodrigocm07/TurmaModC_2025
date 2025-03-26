package ExerciciosJava;

import java.util.Scanner;


public class EX_C1 {
    public static void main(String[] args) {
        
                Scanner teclado = new Scanner(System.in);

                System.out.print("Digite o numero real: ");
                               double numero = teclado.nextDouble();
                               double dobro = (numero * 2);
                               double terca = (numero / 3);
                                
                               System.out.println("O dobro vai ser "+dobro+" e a terca parte vai ser "+ String.format("%.4f", terca));
                 }
    
}
