package EX12_Porta;


public class Porta {
private boolean aberta;
    private String cor;

    public Porta(boolean aberta, String cor) {
        this.aberta = aberta;
        this.cor = cor;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void abrir() {
        aberta = true;
        System.out.println("A porta foi aberta.");
    }

    public void fechar() {
        aberta = false;
        System.out.println("A porta foi fechada.");
    }

    public void status() {
        System.out.println("----- PORTA -----");
        System.out.println("Cor: " + cor);
        System.out.println("Estado: " + (aberta ? "Aberta" : "Fechada"));
        System.out.println("-----------------");
    }
}
