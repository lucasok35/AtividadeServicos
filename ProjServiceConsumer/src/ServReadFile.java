import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidade.Escola;



public class ServReadFile {
	
	public static void main(String[] args) {
		ReadFileCVS();
		
		
	}
	
	public static void ReadFileCVS() {
		//C:\Users\\Dante\\Documents\\FonteDados.csv
		
		List<Escola> lstArquivo = new ArrayList<>(); 
		File arquivoCSV = new File("C:\\Users\\Dante\\Documents\\FonteDados.csv");

		try {

			String LinhasdoArquivo = new String();
			
			
			Scanner ler = new Scanner(arquivoCSV);

			while (ler.hasNext()) {

				LinhasdoArquivo = ler.nextLine();

				System.out.println(LinhasdoArquivo);
				
				lstArquivo.add(getObj(LinhasdoArquivo.split(";")));
				
				ServWriteDataBase.salvar(lstArquivo);
			}

		} catch ( IOException e) {
			e.printStackTrace();
		}
		
		
		//lstArquivo.forEach(a -> System.out.println(Arrays.toString(a)));

	}

	private static Escola getObj(String[] split) {
		
		
		Escola escola = new Escola();
		
		escola.setId(split[0]);
		escola.setSchoolCode(split[1]);
		escola.setSchoolName(split[2]);
		escola.setAddress(split[3]);
		escola.setCity(split[4]);
		escola.setStateCode(split[5]);
		escola.setZipCode(split[6]);
		escola.setProvince(split[7]);
		escola.setCountry(split[8]);
		escola.setPostalCode(split[9]);
		
		
		
		
		return escola;
	}
	
	

}
