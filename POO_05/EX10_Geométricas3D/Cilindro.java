package EX10_Geométricas3D;

public class Cilindro extends FiguraGeometrica3D {

    private final double raio;
    private final double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return Math.PI * raio * raio * altura;
    }

}
