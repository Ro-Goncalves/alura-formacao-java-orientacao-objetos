package curso.javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
//import java.net.Socket;

public class TesteCopiarArquivo {
    public static void main(String[] args) {
       
        try{
            //Socket s = new Socket();

            //Input a partir de um arquivo
            InputStream input = new FileInputStream("lorem.txt");

            //Input a partir do teclado
            //InputStream input = System.in;

            //Input a partir da rede            
            //InputStream input = s.getInputStream();

            Reader isr = new InputStreamReader(input);
            BufferedReader br = new BufferedReader(isr);
            
            //Saída para um arquivo
            //OutputStream output = new FileOutputStream("lorem2.txt");

            //Saída para o console
            OutputStream output = System.out;

            //Sáida para a rede
            //OutputStream output = s.getOutputStream();
           
            Writer osw = new OutputStreamWriter(output);
            BufferedWriter bw = new BufferedWriter(osw);

            String linha = br.readLine();            

            while(linha != null && !linha.isEmpty()){
                bw.write(linha);
                bw.newLine();
                bw.flush();
                linha = br.readLine();
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
