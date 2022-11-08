package curso.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import curso.javaio.classes.Cliente;
import curso.javaio.classes.ContaCorrente;

public class TesteSerializacaoHeranca {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Cliente cliente = new Cliente();
        cliente.setNome("Rodrigo Gonçalves");
        cliente.setProfissao("Analista");
        cliente.setCpf("12312312312");

        ContaCorrente contaCorrente = new ContaCorrente(123, 321);
        contaCorrente.setTitular(cliente);
        contaCorrente.deposita(123.32);

        ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream("conta-corrente.bin"));
        oos.writeObject(contaCorrente);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(
            new FileInputStream("conta-corrente.bin"));
        ContaCorrente contaCorrenteImportada = (ContaCorrente) ois.readObject();
        System.out.println(contaCorrenteImportada.getTitular().getNome() + " - " + contaCorrenteImportada.getSaldo());
        ois.close();
    }
}
