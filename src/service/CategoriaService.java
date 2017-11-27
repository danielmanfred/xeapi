package service;

import java.sql.PreparedStatement;
import java.util.List;

import dao.CategoriaDAO;
import domain.Categoria;
import utility.Conexao;

public class CategoriaService extends GenericService {
	
	private List<Categoria> categorias;
	private Categoria categoria;
	
	public CategoriaService(Conexao conexao) {
		setConexao(conexao);
	}
	
	public List<Categoria> getCategorias() {
		return categorias;
	}
	
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public void adicionarCategoria(Integer id, String nome) {
		CategoriaDAO dao = new CategoriaDAO();
		categoria = new Categoria();
		
		categoria.setId(id);
		categoria.setNome(nome);
		
		String sql = dao.salvar();
		
		try {
			PreparedStatement statement = conexao.connection.prepareStatement(sql);
			statement.setInt(1, categoria.getId());
			statement.setString(2, categoria.getNome());
			statement.executeUpdate();
			System.out.println("A categoria foi adicionada");
		}
		catch (Exception e) {
			System.out.println("A categoria foi adicionada");
		}
	}
	
	public Integer buscar(Integer id) {
		return 0;
	}
	
	public void listar() {
		
	}
}
