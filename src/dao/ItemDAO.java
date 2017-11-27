package dao;

import domain.Item;

public class ItemDAO extends GenericDao<Item> {

	public String salvar() {
		return "INSERT INTO item (nome, descricao, categoria_id) VALUES (?,?,?)";
	}
}
