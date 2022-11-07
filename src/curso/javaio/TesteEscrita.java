package curso.javaio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
    public static void main(String[] args) {

        try (OutputStream fos = new FileOutputStream("lorem_teste.txt")) {
            Writer osw = new OutputStreamWriter(fos);	
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Teste de Escrita");
            bw.newLine();
            bw.newLine();
            bw.write("Oi mundo");

            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
