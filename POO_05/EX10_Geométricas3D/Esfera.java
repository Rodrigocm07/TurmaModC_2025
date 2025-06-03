package EX10_Geométricas3D;

public class Esfera extends FiguraGeometrica3D {

    private final double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

}
