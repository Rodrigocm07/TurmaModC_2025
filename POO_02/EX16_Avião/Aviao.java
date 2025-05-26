package EX16_Avião;


public class Aviao {
    private String modelo;
    private int capacidadePassageiros;
    private double velocidadeMaxima;

    public Aviao(String modelo, int capacidadePassageiros, double velocidadeMaxima) {
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void status() {
        System.out.println("----- AVIÃO -----");
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade de passageiros: " + capacidadePassageiros);
        System.out.printf("Velocidade máxima: %.2f km/h\n", velocidadeMaxima);
        System.out.println("------------------");
    }
}
