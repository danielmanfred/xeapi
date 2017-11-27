package dao;

import domain.Demanda;

public class DemandaDAO extends GenericDao<Demanda> {

	public String salvar() {
		return "INSERT INTO demanda (solicitador, item_id) VALUES (?,?)";
	}
}
