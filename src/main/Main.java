package main;

import service.*;
import util.ConnectionDatabase;

public class main {

	public main() {
		
	}
	
	
	public static void main(String[] args) {
		
		ConnectionDatabase database = new ConnectionDatabase();
		
		UsuarioService service = new UsuarioService(database);
		
		service.selecionarOfertaDemandada(4);
		
		database.desconectar();
	}

}
