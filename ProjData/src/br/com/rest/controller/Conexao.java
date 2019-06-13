package br.com.rest.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexao {

	public static Connection getConnection() {

		Connection conn = null;
		String url ="jdbc:sqlserver://localhost:1434;databaseName=BDEscola;user=DANTE-PC;password=1111 ";
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		Statement stmt;
		try {

			Class.forName(driver);// .newInstance();
			conn = DriverManager.getConnection(url);
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}
}
