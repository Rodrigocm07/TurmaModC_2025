package ExerciciosJava;

import java.util.Scanner;


public class EX_D1 {
    public static void main(String[] args) {
        
                Scanner teclado = new Scanner(System.in);
        
                System.out.print("Digite um numero em metros para fazer a conversao: ");
                           double numero = teclado.nextDouble();
                           double KM = (numero * 100);
                           double CM = (numero / 1000);
                           
                System.out.println("Em Quilometros fica: "+ String.format("%.2f", KM)+" e em centimetros fica: " + String.format("%.2f", CM));
    }
  
}
