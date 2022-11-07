package curso.javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("contas_2.csv"), "UTF-8");
        while(scanner.hasNext()){
            Scanner linha = new Scanner(scanner.nextLine());
            System.out.println(linha.nextLine());
        }
    }
}
