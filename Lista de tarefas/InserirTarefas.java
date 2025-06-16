package Lista_de_Tarefas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirTarefas {
    public void inserir(String titulo, String descricao, String status) {
        ConexaoBD CBD = new ConexaoBD();

        try (Connection conexao = CBD.conectar()) {
            if (conexao == null) {
                System.out.println("Falha ao conectar ao banco de dados.");
                return;
            }
            
            String sql = "INSERT INTO tarefas(titulo, descricao, status) VALUES (?, ?, ?);";
            
            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.setString(1, titulo);
                ps.setString(2, descricao);
                ps.setString(3, status);
                ps.executeUpdate();
                System.out.println("Tarefa inserida com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir a tarefa: " + e.getMessage());
        }
    }
}