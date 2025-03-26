package ExerciciosJava3;

import java.util.Scanner;


public class EX_G3 {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
        System.out.print("Digite o valor da casa: ");
        double casa = teclado.nextDouble();
        
        System.out.print("Digite seu salario ");
        double salario = teclado.nextDouble();
  
        System.out.print("Digite em quantos anos deseja pagar: ");
        double anos = teclado.nextDouble();
        
        double prestacao = casa / (anos * 12);
        
        if(prestacao > (salario*0.3)){
            
        System.out.println("\nNEGADO! A prestação mensal de R$ " + String.format("%.2f",prestacao) + " excede 30%."); 
        
        }else{
            
        System.out.println("\nAPROVADO! A prestação mensal será de R$ " + String.format("%.2f",prestacao)); 

        }
    }
}
