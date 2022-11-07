package curso.javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("contas.csv"))) {
          
            while(scanner.hasNextLine()){
                String linha = scanner.nextLine();
                System.out.println(linha);

                Scanner linhaScanner = new Scanner(linha);
                linhaScanner.useLocale(Locale.US);
                linhaScanner.useDelimiter(",");

                String valor = linhaScanner.next();
                Integer conta = linhaScanner.nextInt();
                System.out.println("Tipo Conta: " + valor + " Conta: " + conta);

                String[] valores = linha.split(",");
                System.out.println(Arrays.toString(valores));

                linhaScanner.close();
            }

            scanner.close();
        } catch (FileNotFoundException e) {          
            e.printStackTrace();
        }
    }
}
