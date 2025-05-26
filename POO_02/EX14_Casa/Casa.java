package EX14_Casa;


public class Casa {
    private int numero;
    private String cor;
    private Pessoa proprietario;

    public Casa(int numero, String cor, Pessoa proprietario) {
        this.numero = numero;
        this.cor = cor;
        this.proprietario = proprietario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public void status() {
        System.out.println("----- CASA -----");
        System.out.println("Número: " + numero);
        System.out.println("Cor: " + cor);
        proprietario.status();
        System.out.println("----------------");
    }
}
