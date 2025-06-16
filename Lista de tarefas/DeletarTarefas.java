package Lista_de_Tarefas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletarTarefas {
    public void deletar(String id) throws SQLException {
        ConexaoBD CBD = new ConexaoBD();

        try (Connection conexao = CBD.conectar()) {
            if (conexao == null) {
                System.out.println("Falha ao conectar ao banco de dados.");
                return;
            }
            
            String sql = "DELETE FROM tarefas WHERE id = ?;";

            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.setString(1, id);
                int linhasAfetadas = ps.executeUpdate();
                
                if (linhasAfetadas > 0) {
                    System.out.println("Tarefa deletada com sucesso!");
                } else {
                    System.out.println("Nenhuma tarefa encontrada com o ID: " + id);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar a tarefa: " + e.getMessage());
        }
    }
}