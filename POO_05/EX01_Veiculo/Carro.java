package EX01_Veiculo;

public class Carro extends Veiculo {

    private final int porta;

    public Carro(String marca, String modelo, int ano, int porta) {
        super(marca, modelo, ano);
        this.porta = porta;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + porta);
    }
}
