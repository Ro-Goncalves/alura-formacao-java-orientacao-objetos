package curso.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String nome = "Rodrigo Gonçalves";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("TesteOOS.bin"));
        oos.writeObject(nome);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("TesteOOS.bin"));
        String nomeRecuperado = (String) ois.readObject();
        System.out.println(nomeRecuperado);
        ois.close();
    }
}
