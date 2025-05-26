package EX03_FiguraGeometrica;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Digite o raio do círculo:");
        double raio = sc.nextDouble();
        
        Circulo circulo = new Circulo(raio);
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }
    }

}
