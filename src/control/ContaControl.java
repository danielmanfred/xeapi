package control;

import service.UsuarioService;
import util.ConnectionDatabase;
import utility.Conexao;

public class ContaControl extends UsuarioService {
	
	
	public ContaControl(Conexao conexao) {
		super(conexao);
		// TODO Auto-generated constructor stub
	}

	static ConnectionDatabase database = new ConnectionDatabase();
	
	

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
