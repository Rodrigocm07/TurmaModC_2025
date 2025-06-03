package EX01_Veiculo;

public class Caminhao extends Veiculo {

    private final double carga;

    public Caminhao(String marca, String modelo, int ano, double carga) {
        super(marca, modelo, ano);
        this.carga = carga;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade de carga: " + carga + " toneladas");
    }
}
