package service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.ItemDAO;
import domain.Categoria;
import domain.Item;
import utility.Conexao;

public class ItemService extends GenericService {
	
	private Item item;
	
	public ItemService(Conexao conexao) {
		setConexao(conexao);
	}
	
	public void adicionarItem(String nome, String descricao, Integer categoria) {
		item = new Item();
		ItemDAO dao = new ItemDAO();
		
		item.setNome(nome);
		item.setDescricao(descricao);
		
		String sql = dao.salvar();
		
		try {
			PreparedStatement statement = conexao.connection.prepareStatement(sql);
			statement.setString(1, item.getNome());
			statement.setString(2, item.getDescricao());
			statement.setInt(3, categoria);
			statement.executeUpdate();
			System.out.println("Material criado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("\nErro na criação do material");
		}
	}
}
