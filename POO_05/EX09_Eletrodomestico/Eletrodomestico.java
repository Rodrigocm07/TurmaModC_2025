package EX09_Eletrodomestico;


public class Eletrodomestico {

    private final String marca;
    private final String modelo;
    private final boolean ligado;

    public Eletrodomestico(String marca, String modelo, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = ligado;
    }
    
    public void exibirInfo() {
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Está ligado? "+ligado);
    }
    
}
