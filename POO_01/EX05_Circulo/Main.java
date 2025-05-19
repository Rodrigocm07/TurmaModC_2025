
package EX05_Circulo;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            circulo circulo = new circulo();
            
            System.out.print("Digite o raio: ");
            circulo.raio = sc.nextDouble();
            
            System.out.println("\nO resultado da area é: "+circulo.calcularArea());
            
            System.out.println("\nO resultado da circunferência:"+circulo.calcularCircunferencia());
        }
    }

    
    
    
}
