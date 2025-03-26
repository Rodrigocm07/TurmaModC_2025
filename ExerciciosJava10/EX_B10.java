package ExerciciosJava10;

import static ExerciciosJava10.EX_B10.ehPar;
import java.util.Scanner;


public class EX_B10 {  
    
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
    
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero e verifica \nse ele é par ou impar: ");
        int numero = teclado.nextInt();
        
        boolean resultado = ehPar(numero);
        
        if (resultado){
            System.out.println("\nO numero "+numero+" é par");
        }else{
            System.out.println("\nO numero "+numero+" é impar");
        }
           
    }
}
