package main;

import service.*;
import util.ConnectionDatabase;

public class Main {

	public Main() {
		
	}
	
	
	public static void main(String[] args) {
		
		ConnectionDatabase database = new ConnectionDatabase();
		
		UsuarioService service = new UsuarioService(database);
		
		service.logar("Dom Pedro II", "omem");
		
		//service.ofertar("Memória Ram", "2 GB", 1, 20.00);
		
		//service.selecionarOfertaNaoDemandada(3);
		
		service.selecionarOfertaDemandada(7);
		
		database.desconectar();
	}

}
