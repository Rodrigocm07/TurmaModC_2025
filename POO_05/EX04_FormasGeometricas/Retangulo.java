package EX04_FormasGeometricas;


public class Retangulo extends FormaGeometrica {

    private final double largura, altura;

    public Retangulo(double base, double altura) {
        this.largura = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura*altura;
    }
    
}
