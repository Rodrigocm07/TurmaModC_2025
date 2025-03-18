package ExerciciosJava7;

import java.util.ArrayList;
import java.util.Scanner;


public class EX_A7 {
    public static void main(String[] args) {
        
    try (Scanner teclado = new Scanner(System.in)){
    
     ArrayList<String> listadeCidades = new ArrayList<>();
     
     while(true){
         System.out.println("Adicione o nome da cidade a lista: ");
         String cidades = teclado.nextLine();
         
         if (cidades.contentEquals("fim")){
             break;
         }
         listadeCidades.add(cidades);
     }
        System.out.println("== Lista de cidades ==");
        for(String lista : listadeCidades){
        System.out.println(lista);
        }
    }
}
}
