package EX03_Carro;

public class carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;
    
    public carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

        public void status() {
        System.out.println("\nInformações do Carro:");
        System.out.println("\nMarca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("\nO carro foi ligado. VAMO NESSA!");
        } else {
            System.out.println("\nO carro já está ligado.");
        }
    }
    
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("\nO carro foi desligado.");
        } else {
            System.out.println("\nO carro já está desligado.");
        }
    }
}