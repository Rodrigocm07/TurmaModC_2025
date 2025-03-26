package ExerciciosJava10;

import java.util.Scanner;


public class EX_C10 {
    
 public static double Fatorial(int numero) {

     double resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     
        int num;
        
        do{
        
        System.out.print("Digite o numero do fatorial: ");
        num = teclado.nextInt();
        if(num < 0){
            System.out.println("Numero negativo, digite novamente.");
        }
        
        }while(num < 0 || num > 200);
        
        double resultado = Fatorial(num);
        System.out.printf("%d! = %.0f", num, resultado);
    }

}
