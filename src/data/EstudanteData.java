/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import dao.UsuarioDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Manfred
 */
public class EstudanteData extends UsuarioDAO {
    
    public void salvar(String nome, String senha, String matricula) {

		String sql = "INSERT INTO categoria (nome, nota, senha, matricula) VALUES (?,?,?,?)";
		try {
			PreparedStatement statement = conexao.connection.prepareStatement(sql);
			statement.setString(1, nome);
			statement.setInt(2, 0);
			statement.setString(3, senha);
                        statement.setString(4, matricula);
			statement.executeUpdate();
			System.out.println("Conta criada com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("\nErro na criação da conta");
		}
	}
}
