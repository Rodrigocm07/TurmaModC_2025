package EX10_Geométricas3D;


public class Cubo extends FiguraGeometrica3D {

    private final double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }
    
}
