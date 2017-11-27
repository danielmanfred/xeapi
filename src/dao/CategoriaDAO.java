package dao;

import domain.Categoria;

public class CategoriaDAO extends GenericDao<Categoria> {

	public String salvar() {
		return "INSERT INTO categoria (id, nome) VALUES (?, ?)";
	}
	
	public String buscar() {
		return "SELECT ";
	}
	
	public String listar() {
		return "SELECT nome FROM categoria";
	}
}
