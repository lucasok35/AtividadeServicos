import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import com.owlike.genson.Genson;
import entidade.Escola;





public class ServWriteDataBase {
	
	public static void salvar( List<Escola> escolaList ) throws IOException {
		
		Genson genson = new Genson();
		
		String csv = genson.serialize(escolaList);
		
		URL url = new URL("http://localhost:8080/salvar/" + csv);
		
		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		urlConnection.setRequestMethod("POST");
	
		if ( urlConnection.getResponseCode() != 200 ) {
			throw new RuntimeException("Erro ao chamar serviço para salvar o CSV");
		}
		
	}

}
