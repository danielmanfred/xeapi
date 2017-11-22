package dao;

import domain.Usuario;

public class UsuarioDAO extends GenericDao<Usuario> {
	
	public String salvar() {
		return "INSERT INTO usuario (nome, nota, senha) VALUES (?,?,?)";
	}
	
	public String excluir() {
		return "DELETE FROM usuario WHERE id = ?";
	}
	
	public String alterarNome() {
		return "UPDATE usuario SET nome = ? WHERE id = ?";
	}
}
