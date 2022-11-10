package curso.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import curso.javaio.classes.Cliente;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Cliente cliente = new Cliente();
        cliente.setNome("Rodrigo Gonçalves");
        cliente.setProfissao("Analista de sistemas");
        cliente.setCpf("23423453225");

        ObjectOutputStream objectOutputStream = 
            new ObjectOutputStream(
                new FileOutputStream("cliente.bin"));

        objectOutputStream.writeObject(cliente);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = 
            new ObjectInputStream(
                new FileInputStream("cliente.bin"));
        Cliente cliente2 = (Cliente) objectInputStream.readObject();
        System.out.println(cliente2.getNome() + " - " + cliente2.getProfissao());
        objectInputStream.close();
    }
}
