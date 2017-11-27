package service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import dao.UsuarioDAO;
import domain.Usuario;
import utility.Conexao;

public class UsuarioService extends GenericService {

	private List<Usuario> usuarios;
	private Usuario usuario;
	
	public UsuarioService(Conexao conexao) {
		setConexao(conexao);
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void criarConta(String nome, Integer nota, String senha) {
		UsuarioDAO dao = new UsuarioDAO();

		usuario = new Usuario();

		usuario.setNome(nome);
		usuario.setNota(nota);
		usuario.setSenha(senha);

		String sql = dao.salvar();
		try {
			PreparedStatement statement = conexao.connection.prepareStatement(sql);
			statement.setString(1, usuario.getNome());
			statement.setInt(2, usuario.getNota());
			statement.setString(3, usuario.getSenha());
			statement.executeUpdate();
			System.out.println("Conta criada com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("\nErro na criação da conta");
		}
	}

	public void excluirConta(Integer id) {
		UsuarioDAO dao = new UsuarioDAO();

		String sql = dao.excluir();

		try {
			PreparedStatement statement = conexao.connection.prepareStatement(sql);

			statement.setInt(1, id);
			statement.executeUpdate();
			System.out.println("Conta excluída sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("\nErro na remoção da conta");
		}
	}

	public void alterarNome(Integer id, String nome) {
		UsuarioDAO dao = new UsuarioDAO();

		usuario = new Usuario();

		usuario.setNome(nome);
		
		String sql = dao.alterarNome();

		try {
			PreparedStatement statement = conexao.connection.prepareStatement(sql);

			statement.setString(1, usuario.getNome());
			statement.setInt(2, id);
			statement.executeUpdate();
			System.out.println("Nome alterado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("\nErro na alteração do nome");
		}
	}
}
