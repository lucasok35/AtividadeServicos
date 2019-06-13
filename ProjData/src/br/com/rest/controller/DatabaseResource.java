package br.com.rest.controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.owlike.genson.Genson;

import entidade.Escola;



@Path( "/data" )
public class DatabaseResource {
	
	
	private Connection connection;
	
	
	public DatabaseResource(){
		connection = Conexao.getConnection();
	}
	
	@POST
	@Path("/salvar/{csv}")
	public boolean salvarCsv( @PathParam( "csv" ) String csv ) throws SQLException {
		
		
		
		List<Escola> escolaList = new Genson().deserialize(csv, List.class);
		
		for (Escola escola : escolaList) {
			
		
		boolean status = false;
		
		// insert no banco das escolas
		try{
			PreparedStatement stmt = this.connection.prepareStatement("INSERT INTO DBescola"
					+ "( schoolCode, schoolName, address, city, stateCode, zipCode, province, country, postalCode) "
					+ "values(?,?,?,?,?,?,?,?,?)");
			
			stmt.setString(1, escola.getSchoolCode());
			stmt.setString(2, escola.getSchoolName());
			stmt.setString(3, escola.getAddress());
			stmt.setString(4, escola.getCity());
			stmt.setString(5, escola.getStateCode());
			stmt.setString(6, escola.getZipCode());
			stmt.setString(7, escola.getProvince());
			stmt.setString(8, escola.getCountry());
			stmt.setString(9, escola.getPostalCode());
			
			stmt.execute();
			status = true;
			
		}catch( SQLException e){
			System.err.println(e.toString());
			status = false;
		}finally{
			connection.close();
		}
		return status;
		
		}
		return false;
		
	}	
	
	/*
	@GET
	@Path("/buscar")
	public String buscarCsv() {

		Genson genson = new Genson();
		
		List<Escola> escolaList = new ArrayList<>();
		
		// aqui select no banco, depois preenche a lista com as escolas
		
		return genson.serialize(escolaList);
	}*/

}
