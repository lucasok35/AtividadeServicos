import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.owlike.genson.Genson;

import entidade.Escola;


@Path( "/csv" )
public class ServFindAllService {
	
	@POST
	@Path("/grava")
	public void gravaCsv() {
		ServReadFile.ReadFileCVS();
	}
	
	@GET
	@Path("/ler")
	public String lerCsv() {
		
		URL url;
		try {
			url = new URL("http://localhost:8080/buscar/" );
			
			HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
			urlConnection.setRequestMethod("POST");
			
			if ( urlConnection.getResponseCode() != 200 ) {
				throw new RuntimeException("Erro ao chamar serviço para salvar o CSV");
			}
			
			return urlConnection.getResponseMessage();
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}

}
