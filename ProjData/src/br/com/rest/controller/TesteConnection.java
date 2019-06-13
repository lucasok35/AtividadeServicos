package br.com.rest.controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConnection {

	public static void main(String[] args) {

		System.out.println("Inicio");

		try {

			Connection conn = Conexao.getConnection();
			String query = "select schoolName from DBESCOLA";

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.println(rs.getString("schoolName"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Conectou!");
	}

}
