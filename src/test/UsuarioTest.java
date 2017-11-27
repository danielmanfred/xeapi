package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import service.UsuarioService;
import util.ConnectionDatabase;

public class UsuarioTest {

	ConnectionDatabase database = new ConnectionDatabase();
	UsuarioService usuarioService;
	
	@Before
	public void setUp() throws Exception {
		usuarioService = new UsuarioService(database);
	}

	@Test
	public void testCriarConta() {
		usuarioService.criarConta("Sócrates", 10, "mpnd");
	}
	
	@After
	public void fechar() {
		database.desconectar();
	}
}
