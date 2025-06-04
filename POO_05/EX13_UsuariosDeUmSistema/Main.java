package EX13_UsuariosDeUmSistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> usuario = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int op;
            
            do {
                System.out.println("\n==== MENU DE USUÁRIOS ====");
                System.out.println("1 - Cadastrar Administrador");
                System.out.println("2 - Cadastrar Editor");
                System.out.println("3 - Cadastrar Leitor");
                System.out.println("4 - Exibir todos os usuários");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                op = sc.nextInt();
                sc.nextLine();
                
                switch (op) {
                    case 1 -> {
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Login: ");
                        String login = sc.nextLine();
                        System.out.print("Nível de acesso: ");
                        int nivel = sc.nextInt();
                        sc.nextLine();
                        usuario.add(new Administrador(nome, login, nivel));
                        System.out.println("👨‍💼 Administrador cadastrado!");
                    }
                    
                    case 2 -> {
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Login: ");
                        String login = sc.nextLine();
                        System.out.print("Permissões de edição: ");
                        String permissoes = sc.nextLine();
                        usuario.add(new Editor(nome, login, permissoes));
                        System.out.println("✍️ Editor cadastrado!");
                    }
                    
                    case 3 -> {
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Login: ");
                        String login = sc.nextLine();
                        System.out.print("Histórico de leitura: ");
                        String historico = sc.nextLine();
                        usuario.add(new Leitor(nome, login, historico));
                        System.out.println("📖 Leitor cadastrado!");
                    }
                    
                    case 4 -> {
                        if (usuario.isEmpty()) {
                            System.out.println("Nenhum usuário cadastrado.");
                        } else {
                            System.out.println("\n=== USUÁRIOS CADASTRADOS ===");
                            for (Usuario u : usuario) {
                                System.out.println("--------------");
                                u.exibirInfo();
                            }
                        }
                    }
                    
                    case 0 -> System.out.println("Encerrando programa...");
                    default -> System.out.println("Opção inválida.");
                }
                
            } while (op != 0);
        }
    }
}
