package ExerciciosJava7;

import java.util.ArrayList;
import java.util.Scanner;


public class EX_C7 {
    public static void main(String[] args) {
        
            try (Scanner teclado = new Scanner(System.in)){

            ArrayList<Double> listadeNumeros = new ArrayList<>();
            
         while(true){
         System.out.print("Adicione os numeros na lista: ");
         double numeros = teclado.nextInt();
         
         if (numeros <= 0){
             break;
         }
         
        listadeNumeros.add(numeros);
        
     }        
        System.out.println("== Lista de numeros ==");
        for(double lista : listadeNumeros){
        System.out.println(lista); 
      
        } 
       double acheNumero = listadeNumeros.get(2);
       System.out.println("\n O  terceiro numero decimal é: "+acheNumero);
       
    }
}
}