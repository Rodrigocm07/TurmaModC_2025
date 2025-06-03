package EX09_Eletrodomestico;


public class Microondas extends Eletrodomestico {

    private final int potencia;

    public Microondas (String marca, String modelo, boolean ligado, int potencia) {
        super(marca, modelo, ligado);
        this.potencia = potencia;
    }
    
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Potencia: "+potencia);
    }
    
}
