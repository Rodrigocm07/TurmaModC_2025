package ExerciciosJava5_1;

import java.util.Scanner;


public class EX_B5_1 {
    public static void main(String[] args) {
    
        try (Scanner teclado = new Scanner(System.in)) {
            int cont = 1;
            int nota = 0;
            do{
                
                System.out.print("Digite a "+cont+"ª nota: ");
                nota = teclado.nextInt();
                cont++;
            
            } while (cont <= 4);
            System.out.println("A soma de todos os valores é: " + nota/4);
    }   
    }
}

