package ExerciciosJava4;

import java.util.Random;
import java.util.Scanner;


public class EX_J4 {
    public static void main(String[] args) {
        
        Random rm = new Random();
        Scanner teclado = new Scanner(System.in);
        
        int numero = rm.nextInt(100); 
        int tentativa;
        int palpite = 0;
        
        System.out.println("Tente adivinhar o número entre 1 e 100!");
        
        for(tentativa = 1; tentativa <=7; tentativa++){
            System.out.print("Tentativa "+tentativa+": ");
            palpite = teclado.nextInt();
            
            if (palpite == numero){
                System.out.println("Parabéns! Você acertou na "+tentativa+" tentativa");
                break;
            }else if(palpite < numero) {
                System.out.println("O numero é maior");
            }else{
                System.out.println("O numero é menor");
            }
        }
        if (palpite != numero){
            System.out.println("Você não conseguiu adivinhar o numero.\nO numero era"+numero);
        }
        
        
    }
}
