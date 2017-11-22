package main;

import control.ContaControl;

public class Main {

	public Main() {
		
	}
	
	public static void main(String[] args) {
		
		ContaControl control = new ContaControl();
		
		control.criarConta("John", 9, "lsd2");;
		
		control.desconectar();
	}

}
