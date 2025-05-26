package EX11_Televisão;


public class Televisao {
private int volume;
    private int canal;

    public Televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume aumentado para " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume diminuído para " + volume);
    }

    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal alterado para " + canal);
    }

    public void status() {
        System.out.println("----- TELEVISÃO -----");
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
        System.out.println("----------------------");
    }
}
