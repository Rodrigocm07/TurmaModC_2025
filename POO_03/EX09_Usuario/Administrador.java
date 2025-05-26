package EX09_Usuario;


class Administrador implements Contas {
    @Override
    public void acessarSistema() {
        System.out.println("Administrador acessou o sistema.");
    }

    @Override
    public void realizarOperacao() {
        System.out.println("Operação administrativa realizada.");
    }
}

