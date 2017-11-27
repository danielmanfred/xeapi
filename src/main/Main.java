package main;

import service.*;
import util.ConnectionDatabase;

public class Main {

	public Main() {
		
	}
	
	
	public static void main(String[] args) {
		
		ConnectionDatabase database = new ConnectionDatabase();
		
		DemandaService service = new DemandaService(database);
		
		service.demandar(10,3);
		
		database.desconectar();
	}

}
