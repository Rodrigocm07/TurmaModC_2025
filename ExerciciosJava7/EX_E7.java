package ExerciciosJava7;

import java.util.ArrayList;
import java.util.Scanner;


public class EX_E7 {
    public static void main(String[] args) {
        
    try (Scanner teclado = new Scanner(System.in)){
    
     ArrayList<String> listadeCaracteres = new ArrayList<>();
     
     while(true){
         System.out.print("Adicione os caracteres: ");
         String caracteres = teclado.nextLine();
         
         if (caracteres.contentEquals("fim")){
             break;
         }
         
         listadeCaracteres.add(caracteres);
         
     }
        System.out.println("== Lista de caracteres ==");
        for(String lista : listadeCaracteres){
        System.out.println(lista);
        } 
        int tamanho = listadeCaracteres.size();
        System.out.println("\n-> Nesta lista contém "+tamanho+" caracteres");
    }
}
}