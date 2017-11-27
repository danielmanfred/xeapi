package service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.DemandaDAO;
import domain.Demanda;
import domain.Item;
import domain.Usuario;
import utility.Conexao;

public class DemandaService extends GenericService {

	private Demanda demanda;
	
	public DemandaService(Conexao conexao) {
		setConexao(conexao);
	}
	
	public void demandar(Integer solicitador, Integer item) {
		DemandaDAO dao = new DemandaDAO();
		
		String sql = dao.salvar();
		
		try {
			PreparedStatement statement = conexao.connection.prepareStatement(sql);
			statement.setInt(1, solicitador);
			statement.setInt(2, item);
			statement.executeUpdate();
			System.out.println("Demanda realizada com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("\nErro na realização da demanda");
		}
	}
}
