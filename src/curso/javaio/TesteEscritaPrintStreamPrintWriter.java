package curso.javaio;

import java.io.FileNotFoundException;
//import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) {
        //try (PrintStream ps = new PrintStream("lorem_printstream.txt")) {
        try (PrintWriter ps = new PrintWriter("lorem_writer.txt")) {
            ps.println("Oi PrintWriter");
            ps.println();
            ps.println("Sou uma outra linha");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
