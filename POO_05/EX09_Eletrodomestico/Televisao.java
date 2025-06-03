package EX09_Eletrodomestico;

public class Televisao extends Eletrodomestico {

    private final int canal, volume;

    public Televisao(String marca, String modelo, boolean ligado, int canal, int volume) {
        super(marca, modelo, ligado);
        this.canal = canal;
        this.volume = volume;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();

        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }

}
