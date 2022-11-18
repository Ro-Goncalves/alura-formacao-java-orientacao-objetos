package curso.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

        Integer s = curso.stream()
            .filter(c -> c.getAlunos() >= 100)
            .mapToInt(Curso::getAlunos)
            .sum();
            //.map(Curso::getAlunos)
            //.forEach(System.out::println);
            //.forEach(c -> System.out.println(c.getNome()));

        System.out.println(s);

        System.out.println("\nCursos Com Mais De 50 Alunos");
        curso.stream()
             .filter(c -> c.getAlunos() > 50)
             .forEach(c -> System.out.println(c.getNome()));

        System.out.println("\nStream<Curso> em Stream<String> com os nomes dos cursos");
        curso.stream()
             .map(Curso::getNome)
             .forEach(System.out::println);

        System.out.println("\nLocalizando um curso com Optional");
        Optional<Curso> opCurso = curso.stream()
             .filter(c -> c.getAlunos() >= 100)
             .findAny();
        
        Curso localizado = opCurso.orElse(null);
        System.out.println(localizado);
        opCurso.ifPresent(c -> System.out.println(c.getNome()));

        //TODO fazer caso a cima concatenado
        OptionalDouble oD = curso.stream()
            .filter(c -> c.getAlunos() >= 100)
            .mapToInt(Curso::getAlunos)
            .average();

        //guardar
        List<Curso> resultado = curso.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());

        //Map<String, Integer> resultadoMap = 
        curso.parallelStream()
            .filter(c -> c.getAlunos() >= 100)
            .collect(Collectors.toMap(Curso::getNome, Curso::getAlunos))
            .forEach((nome, alunos) -> System.out.println("Curso: " + nome + " Possui: " + alunos + " Alunos"));
        //System.out.println(resultadoMap);

    }
}
