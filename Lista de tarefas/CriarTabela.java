package Lista_de_Tarefas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CriarTabela {

    public void criar() {
        ConexaoBD CBD = new ConexaoBD();
        
        try (Connection conexao = CBD.conectar()) {
            if (conexao == null) {
                System.out.println("Falha ao conectar ao banco de dados.");
                return;
            }

            String sql = "CREATE TABLE IF NOT EXISTS tarefas ("
                       + "id INT AUTO_INCREMENT PRIMARY KEY,"
                       + "titulo VARCHAR(50) NOT NULL,"
                       + "descricao VARCHAR(100),"
                       + "status VARCHAR(20) DEFAULT 'Pendente',"
                       + "data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
                       + ");";

            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.execute();
                System.out.println("Tabela 'tarefas' criada ou já existente.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela: " + e.getMessage());
        }
    }
}
    
