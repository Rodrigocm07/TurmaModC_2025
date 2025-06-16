package Lista_de_Tarefas;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CriarTabela criadorTabela = new CriarTabela();
            criadorTabela.criar();
            
            int opcao;
            do {
                System.out.println("\n=== MENU LISTA DE TAREFAS ===");
                System.out.println("1. Adicionar nova tarefa");
                System.out.println("2. Ver todas as tarefas");
                System.out.println("3. Atualizar tarefa");
                System.out.println("4. Deletar tarefa");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                
                opcao = scanner.nextInt();
                scanner.nextLine();
                
                try {
                    switch (opcao) {
                        case 1 -> {
                            System.out.println("\n--- ADICIONAR TAREFA ---");
                            System.out.print("Título: ");
                            String titulo = scanner.nextLine();
                            System.out.print("Descrição: ");
                            String descricao = scanner.nextLine();
                            new InserirTarefas().inserir(titulo, descricao, "Pendente");
                        }
                            
                        case 2 -> new ConsultarTarefas().listarTodas();
                            
                        case 3 -> {
                            System.out.println("\n--- ATUALIZAR TAREFA ---");
                            new ConsultarTarefas().listarTodas();
                            System.out.print("\nDigite o ID da tarefa para atualizar: ");
                            String idAtualizar = scanner.nextLine();
                            System.out.print("Novo título: ");
                            String novoTitulo = scanner.nextLine();
                            System.out.print("Nova descrição: ");
                            String novaDescricao = scanner.nextLine();
                            System.out.print("Novo status (Pendente/Concluída): ");
                            String novoStatus = scanner.nextLine();
                            new AtualizarTarefas().atualizar(idAtualizar, novoTitulo, novaDescricao, novoStatus);
                        }
                            
                        case 4 -> {
                            System.out.println("\n--- DELETAR TAREFA ---");
                            new ConsultarTarefas().listarTodas();
                            System.out.print("\nDigite o ID da tarefa: ");
                            String idDeletar = scanner.nextLine();
                            new DeletarTarefas().deletar(idDeletar);
                        }
                            
                        case 5 -> System.out.println("Saindo do sistema...");
                            
                        default -> System.out.println("Opção inválida!");
                    }
                } catch (SQLException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            } while (opcao != 5);
        }
    }
}