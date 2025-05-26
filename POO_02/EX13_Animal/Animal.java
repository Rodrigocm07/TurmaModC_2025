package EX13_Animal;


public class Animal {
private String nome;
    private String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void status() {
        System.out.println("----- ANIMAL -----");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("------------------");
    }
}
