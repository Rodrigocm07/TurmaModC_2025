package ExerciciosJava3;

import java.util.Scanner;

public class EX_D3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = teclado.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = teclado.nextDouble();
        
        double resultado = (nota1+nota2)/2;
        
        System.out.print("Sua media foi de: "+resultado);

        if(resultado <= 4.9){
            System.out.println("\nVocê foi REPROVADO!");
        
        }else if (resultado >= 5 && resultado <= 6.9){
            System.out.println("\nVocê está de RECUPERAÇÃO!");
        
        }else{
            System.out.println("\nVocê está APROVADO!");
        }
    }
}
