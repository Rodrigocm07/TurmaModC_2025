package EX04_Pessoa;

class Pessoa implements Comparable<Pessoa> {
    private final String nome;
    private final int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa outra) {
        return Integer.compare(this.idade, outra.idade);
    }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos)";
    }
}
