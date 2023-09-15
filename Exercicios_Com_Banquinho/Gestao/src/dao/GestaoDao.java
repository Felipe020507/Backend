package dao;

import model.Gestao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class GestaoDao {
	
	private String url = "jdbc:mysql://localhost:3306/Agenda";
	private String usuario = "root";
	private String senha = "aluno";
	private Connection connection;

	
	public void adicionarContato(Gestao gestao) {
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "INSERT INTO contato (id, nome, email, telefone) VALUES (?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, gestao.getId());
			preparedStatement.setString(2, gestao.getNome());
			preparedStatement.setString(3, gestao.getEmail());
			preparedStatement.setInt(4, gestao.getTelefone());
		}  catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	
	public List<Gestao> obterListaDeContato() {
		List<Gestao> listaDeContato = new ArrayList<>();
		
		try(Connection connetcion = DriverManager.getConnection(url, usuario, senha)){
			String sql = "SELECT * FROM contato";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				String email = resultSet.getString("email");
				int telefone = resultSet.getInt("telefone");
				
				Gestao gesto = new Gestao(id, nome, email, telefone);
				
				listaDeContato.add(gesto);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaDeContato;
 	}
	
	public void excluirContato(Gestao gestao) {
		try(Connection connection = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "DELETE FROM contato WHERE id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, gestao.getId());
			preparedStatement.executeUpdate();
		} catch(SQLException e) {
			 e.printStackTrace();
		}
	}
	
	public Gestao buscaId() {
		try(Connection connection = DriverManager.getConnection(url, usuario, senha)){
			String sql = "SELECT * FROM contato WHERE id = ? ";
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            ResultSet resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	            	int id = resultSet.getInt("id");
	                String nome = resultSet.getString("nome");
	                String email = resultSet.getString("email");
	                int telefone = resultSet.getInt("telefone");
	                return new Gestao(id ,nome, email, telefone);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	}
	
	
	
	public Gestao buscaNome() {
		try(Connection connection = DriverManager.getConnection(url, usuario, senha)){
			String sql = "SELECT * FROM contato WHERE nome = ? ";
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            ResultSet resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	            	int id = resultSet.getInt("id");
	                String nome = resultSet.getString("nome");
	                String email = resultSet.getString("email");
	                int telefone = resultSet.getInt("telefone");
	                return new Gestao(id ,nome, email, telefone);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	}
	

}
