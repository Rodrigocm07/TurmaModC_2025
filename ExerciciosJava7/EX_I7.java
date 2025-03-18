package ExerciciosJava7;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class EX_I7 {
    public static void main(String[] args) {
   
  ArrayList<Integer> Duplicatas = new ArrayList<>();

        
    try (Scanner teclado = new Scanner(System.in)){
        
      while(true){         
         System.out.print("Adicione os numeros na lista: ");
         int numeros = teclado.nextInt();
         
        if (numeros <= 0){             
      break;
      
        }
        Duplicatas.add(numeros);
      }
        System.out.println("== Lista de numeros ==");
        for(int lista : Duplicatas){
        System.out.println(lista);
}
        HashSet<Integer> set = new HashSet<>(Duplicatas); 
        boolean hasNumeros = set.size() != Duplicatas.size();
        
        System.out.println("\n Nesta lista tem numeros duplicados? "+hasNumeros);
}
    
}
}
    
