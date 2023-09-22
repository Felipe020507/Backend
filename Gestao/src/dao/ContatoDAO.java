package dao;

import model.Contato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ContatoDAO {
	
	private String url = "jdbc:mysql://localhost:3306/Agenda";
	private String usuario = "root";
	private String senha = "alunos";
	private Connection connection;

	
	public void inserirContato(Contato contato) {
        try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
            String sql = "INSERT INTO contato (nome, email, telefone) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, contato.getId());
            preparedStatement.setString(1, contato.getNome());
            preparedStatement.setString(2, contato.getEmail());
            preparedStatement.setString(3, contato.getTelefone());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	
	
	 public List<Contato> listarContatos() {
	        List<Contato> listaDeContatos = new ArrayList<>();

	        try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
	            String sql = "SELECT * FROM contato";
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            ResultSet resultSet = preparedStatement.executeQuery();
	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String nome = resultSet.getString("nome");
	                String email = resultSet.getString("email");
	                String telefone = resultSet.getString("telefone");

	                Contato contato = new Contato(id, nome, email, telefone);
	                listaDeContatos.add(contato);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return listaDeContatos;
	    }
	
	
	
	
	
	 public Contato buscarContatoPorId(int id) {
	        try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
	            String sql = "SELECT * FROM contato WHERE id = ?";
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setInt(1, id);
	            ResultSet resultSet = preparedStatement.executeQuery();

	            if (resultSet.next()) {
	                String nome = resultSet.getString("nome");
	                String email = resultSet.getString("email");
	                String telefone = resultSet.getString("telefone");
	                return new Contato(id, nome, email, telefone);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return null;
	    }
	
	
	
	 public List<Contato> buscarContatoPorNome(String nome) {
	        List<Contato> contatos = new ArrayList<>();
	        try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
	            String sql = "SELECT * FROM contato WHERE nome LIKE ?";
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1, "%" + nome + "%");
	            ResultSet resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String email = resultSet.getString("email");
	                String telefone = resultSet.getString("telefone");
	                contatos.add(new Contato(id, nome, email, telefone));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return contatos;
	    }
	   
	 public boolean atualizarContato(Contato contato) {
	        try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
	            String sql = "UPDATE contato SET nome = ?, email = ?, telefone = ? WHERE id = ?";
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1, contato.getNome());
	            preparedStatement.setString(2, contato.getEmail());
	            preparedStatement.setString(3, contato.getTelefone());
	            preparedStatement.setInt(4, contato.getId());
	            int rowsUpdated = preparedStatement.executeUpdate();
	            return rowsUpdated > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return false;
	    }
	
	
	 public boolean excluirContato(int id) {
	        try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
	            String sql = "DELETE FROM contato WHERE id = ?";
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setInt(1, id);
	            int rowsDeleted = preparedStatement.executeUpdate();
	            return rowsDeleted > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return false;
	    }
	

}
