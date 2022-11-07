package curso.javacollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import curso.javacollections.classes.Aula;
import curso.javacollections.classes.Curso;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
        "Rodrigo Gonçalves");

        javaColecoes.adiciona(new Aula("Trabalhadno com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 19));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        aulas.sort(Comparator.comparing(Aula::getTitulo));
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);
    }
}
