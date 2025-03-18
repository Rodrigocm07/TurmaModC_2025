package ExerciciosJava7;

import java.util.ArrayList;
import java.util.Scanner;


public class EX_B7 {
    public static void main(String[] args) {
        
    try (Scanner teclado = new Scanner(System.in)){
    
     ArrayList<Integer> listadeNumeros = new ArrayList<>();
     
     while(true){
         System.out.println("Adicione os numeros na lista: ");
         int numeros = teclado.nextInt();
         
         if (numeros <= 0){
             break;
         }
         
         listadeNumeros.add(numeros);
         listadeNumeros.removeIf(n -> n % 2 == 0);
     }
        System.out.println("== Lista de numeros Impares ==");
        for(int lista : listadeNumeros){
        System.out.println(lista);
        }
    }
}
}