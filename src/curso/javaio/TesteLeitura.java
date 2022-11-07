package curso.javaio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) {
		
		try {
			//Fluxo de entrada com arquivo. Binário
			InputStream fis = new FileInputStream("lorem.txt");
			//Facilitar o trabalho. Caracteres
			Reader isr = new InputStreamReader(fis);
			//Pegando as linhas do arquivos. Linhas			
			BufferedReader br = new BufferedReader(isr);
			
			String linha = br.readLine();
			
			while(linha != null) {
				System.out.println(linha);				
				linha = br.readLine();
			}
			
			br.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
