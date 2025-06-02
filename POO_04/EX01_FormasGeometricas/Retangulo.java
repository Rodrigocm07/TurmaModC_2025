package EX01_FormasGeometricas;

public class Retangulo extends Forma {

    private final double largura;
    private final double altura; // Define altura properly

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
