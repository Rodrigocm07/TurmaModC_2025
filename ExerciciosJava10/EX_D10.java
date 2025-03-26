package ExerciciosJava10;

import java.util.Scanner;


public class EX_D10 {
public static double conversor(double celsius) {
        return (celsius * 9.0/5) + 32; 
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em °C: ");
        double tempC = teclado.nextDouble();
        
        double tempF = conversor(tempC);
        System.out.printf("\nResultado: %.2f°C = %.2f°F", tempC, tempF);
    }
}

