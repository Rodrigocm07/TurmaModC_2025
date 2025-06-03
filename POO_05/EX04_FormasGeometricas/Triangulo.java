package EX04_FormasGeometricas;

public class Triangulo extends FormaGeometrica {

    private final double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

