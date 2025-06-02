package EX01_FormasGeometricas;


public class Main {
    public static void main(String[] args) {
        
        Forma circulo = new Circulo (5);
        Forma retangulo = new Retangulo (4,3);
        Forma triangulo = new Triangulo (6,2);
        
        System.out.printf(" Area do circulo %.2f%n ",circulo.calcularArea());
        System.out.println("Area do retangulo "+retangulo.calcularArea());
        System.out.println(" Area do triangulo "+triangulo.calcularArea());
    }
}
