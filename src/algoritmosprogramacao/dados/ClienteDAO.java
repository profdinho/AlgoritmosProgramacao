package algoritmosprogramacao.dados;

import algoritmosprogramacao.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDAO {
    private final Connection conexao;
    public ClienteDAO() {
        this.conexao = new ConexaoBD().getConnection();
    }
    public void inserirCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente " +
                  "(nome, celular, email, nascimento," + 
                  "senha) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCelular());
            ps.setString(3, cliente.getEmail());
            ps.setDate(4, cliente.getDataNascimento());
            ps.setString(5, cliente.getSenha());
            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao adicionar cliente!");
            throw new RuntimeException(e);
        }
    }
    public boolean logarCliente(String usuario, String senha) {
        String sql = "SELECT * FROM cliente " +
                    " WHERE email = ? AND senha = ?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            else {
                return false;
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao realizar login!");
            throw new RuntimeException(e);
        }
    }
    
}
