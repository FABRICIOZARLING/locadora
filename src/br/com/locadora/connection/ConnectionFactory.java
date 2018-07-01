package br.com.locadora.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	//Atributos
	private final String url = "jdbc:mysql://localhost:3306/locadora";
	private final String user = "root";
	private final String password = "";
	
	// M�todo para obter conex�o
	
	public Connection obterConexao() {
		// vari�vel conexao
		Connection conexao = null;
		
		// tentar conexao
		try {
			conexao = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		//retorno da conexao
		return conexao;
	}

}
