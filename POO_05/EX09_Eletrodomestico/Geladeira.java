package EX09_Eletrodomestico;

public class Geladeira extends Eletrodomestico {

    private final int temperatura;

    public Geladeira(String marca, String modelo, boolean ligado, int temperatura) {
        super(marca, modelo, ligado);
        this.temperatura = temperatura;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Temperatura: " + temperatura);
    }

}
