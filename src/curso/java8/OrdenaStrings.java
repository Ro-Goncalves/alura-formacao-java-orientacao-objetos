package curso.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Alura online");
        palavras.add("editora cada do código");
        palavras.add("coelum");
        
        palavras.sort(new ComparadorPorTamanho());
        System.out.println(palavras);
        
        palavras.forEach(new ImprimeNaLinha());
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
