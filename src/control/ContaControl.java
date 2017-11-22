package control;

import service.UsuarioService;
import util.ConnectionDatabase;

public class ContaControl extends UsuarioService {
	
	
	static ConnectionDatabase database = new ConnectionDatabase();
	
	public ContaControl() {
		super(database);
		database.conectar();
	}

	public void desconectar() {
		database.desconectar();
	}

	
	public void criarConta(String nome, Integer nota, String senha) {
		super.criarConta(nome, nota, senha);
	}

	public void excluirConta(Integer id) {
		super.excluirConta(id);
	}
	
	public void alterarNome(Integer id, String nome) {
		super.alterarNome(id, nome);
	}
}
