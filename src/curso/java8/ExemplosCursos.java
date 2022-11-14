package curso.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemplosCursos {
    public static void main(String[] args) {
        List<Curso> curso = new ArrayList<Curso>();

        curso.add(new Curso("Phyton", 45));
        curso.add(new Curso("JavaScript", 150));
        curso.add(new Curso("Java 8", 113));
        curso.add(new Curso("C", 55));

        curso.sort(Comparator.comparing(Curso::getAlunos));
        curso.forEach(c -> System.out.println(c.getNome()));
        System.out.println("---------------------");

        Integer s =curso.stream()
            .filter(c -> c.getAlunos() >= 100)
            .mapToInt(Curso::getAlunos)
            .sum();
            //.map(Curso::getAlunos)
            //.forEach(System.out::println);
            //.forEach(c -> System.out.println(c.getNome()));

        System.out.println(s);
    }
}
