package EX08_Veiculos;


class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando...");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("Carro virando para " + direcao);
    }
}

