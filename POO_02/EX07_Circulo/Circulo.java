package EX07_Circulo;


public class Circulo {
private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public void status() {
        System.out.println("----- CÍRCULO -----");
        System.out.printf("Raio: %.2f%n", raio);
        System.out.printf("Área: %.2f%n", calcularArea());
        System.out.printf("Circunferência: %.2f%n", calcularCircunferencia());
        System.out.println("-------------------");
    }
}
