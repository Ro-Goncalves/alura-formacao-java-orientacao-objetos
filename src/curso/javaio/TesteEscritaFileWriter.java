package curso.javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("lorem_filewriter.txt")) {           
            fw.write("Oi FileWriter");
            fw.write(System.lineSeparator());
            fw.write(System.lineSeparator());
            fw.write("Minha Linha 2");
            fw.write(System.lineSeparator());

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("OI BufferedWriter");
            bw.newLine();
            bw.newLine();
            bw.write("Sou outra linha");

            bw.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
