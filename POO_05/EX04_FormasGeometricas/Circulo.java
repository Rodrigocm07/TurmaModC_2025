package EX04_FormasGeometricas;


public class Circulo extends FormaGeometrica {

    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

}
