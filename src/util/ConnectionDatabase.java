package util;
                                                                                                             
import utility.Conexao;

public class ConnectionDatabase extends Conexao {
	
	public ConnectionDatabase() {
		setDadosConexao();
		conectar();
	}
	
	public void setDadosConexao() {
		setDriver("org.postgresql.Driver");
		setPath("jdbc:postgresql://localhost:5432/xe");
		setUser("manfred");
		setPassword("1991");
	}

	@Override
	public void conectar() {
		super.conectar();
	}

	@Override
	public void desconectar() {
		super.desconectar();
	}
	
}
