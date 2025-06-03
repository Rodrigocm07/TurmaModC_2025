package EX05_DispositivoEletronico;

public class DispositivoEletronico {

    private final String modelo;
    private final String marca;

    public DispositivoEletronico(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
    }
}
