package EX06_Dispositivo;


class Televisao implements Dispositivo {
    private boolean ligada;

    @Override
    public void ligar() {
        System.out.println("\nA TV ligou...\n");
        ligada = true;
    }

    @Override
    public void desligar() {
        System.out.println("\nA TV desligou...\n");
        ligada = false;
    }

    @Override
    public String obterStatus() {
        return ligada ? "Ligada" : "Desligada";
    }
}

