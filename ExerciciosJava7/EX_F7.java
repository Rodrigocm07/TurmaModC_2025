package ExerciciosJava7;

import java.util.ArrayList;
import java.util.Scanner;


public class EX_F7 {
    public static void main(String[] args) {
        
    try (Scanner teclado = new Scanner(System.in)){
    
     ArrayList<String> listadeFrutas = new ArrayList<>();
     
     while(true){
         System.out.print("Adicione as frutas na lista: ");
         String frutas = teclado.nextLine();
         
         if (frutas.contentEquals("fim")){
             break;
         }
         
         listadeFrutas.add(frutas);
         
     }
        System.out.println("== Lista de frutas ==");
        for(String lista : listadeFrutas){
        System.out.println(lista);
        } 
            listadeFrutas.set(2, "Morango"); 
            System.out.println("\n"+ listadeFrutas);
    }
}
}
