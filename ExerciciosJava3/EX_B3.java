package ExerciciosJava3;

import java.util.Scanner;


public class EX_B3 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    System.out.print("Quantos quilometros você deseja percorrer? ");
    double KM = teclado.nextDouble();
    
    if(KM<=200){
        
    double T1 =(KM*0.50);
    System.out.println("\n Sua tarifa será de R$ "+String.format("%.2f",T1 ));
    
    }else{
    
    double T2 =(KM*0.45);
    System.out.println("\n Sua tarifa será de R$ "+String.format("%.2f",T2 ));
            }
        
    }
    }
