package EX04_Retangulo;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
                try (Scanner sc = new Scanner(System.in)) {
                    
                    retangulo retangulo = new retangulo();
                    
                    System.out.print("Digite a base do retangulo: ");
                    retangulo.base = sc.nextDouble();
                    
                    System.out.print("Digite a altura do retangulo: ");
                    retangulo.altura = sc.nextDouble();
                    
                    System.out.println("\nO calculo da area é: "+retangulo.calcularArea());
                    
                    System.out.println("\nO calculo do perimetro é: "+retangulo.calcularPerimetro());
        }
    }
}
