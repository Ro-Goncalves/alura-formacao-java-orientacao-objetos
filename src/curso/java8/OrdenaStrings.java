package curso.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import static java.util.Comparator.comparing;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Alura online");
        palavras.add("editora cada do código");
        palavras.add("coelum");
        
        //palavras.sort(new ComparadorPorTamanho());
        //palavras.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
        //palavras.sort(Comparator.comparing(s -> s.length()));
        //palavras.sort(Comparator.comparing(String::length));
        palavras.sort(comparing(String::length));
        System.out.println(palavras);

               
        //Classe anônima
        // Consumer<String> c1Consumer = new Consumer<String>() {
        //     @Override
        //     public void accept(String t) {
        //         System.out.println(t);        
        //     }
        // };

        //lambda
        palavras.forEach(t -> System.out.println(t));
        System.out.println("-------------------");
        palavras.forEach(System.out::println);
        System.out.println("-------------------");
        new Thread(() -> System.out.println("Executando um Runnable")).start();

    }
}

/**
 * ComparadorPorTamanho implements Comparator<String>
 */
class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {       
        return o1.length() - o2.length();
    }
}

class ImprimeNaLinha implements Consumer<String>{

    @Override
    public void accept(String t) {
       System.out.println(t);        
    }
    
}
