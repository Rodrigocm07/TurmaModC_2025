package ExerciciosJava7;

import java.util.ArrayList;
import java.util.Scanner;


public class EX_D7 {
    public static void main(String[] args) {
        
    try (Scanner teclado = new Scanner(System.in)){
    
     ArrayList<String> listadeCores = new ArrayList<>();
     
     while(true){
         System.out.print("Adicione as cores: ");
         String cores = teclado.nextLine();
         
         if (cores.contentEquals("fim")){
             break;
         }
         listadeCores.add(cores);
         
         
         
     }
        System.out.println("== Lista de cores ==");
        for(String lista : listadeCores){
        System.out.println(lista);
        } 
        boolean contemAmarelo = listadeCores.contains("amarelo");
        System.out.println("\n-> Na minha lista contém amarelo? "+contemAmarelo);
    }
}
}