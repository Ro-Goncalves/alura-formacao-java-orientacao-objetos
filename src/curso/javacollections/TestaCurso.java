package curso.javacollections;

import java.util.List;

import curso.javacollections.classes.Aula;
import curso.javacollections.classes.Curso;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                                "Rodrigo Gonçalves");

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);

        javaColecoes.adiciona(new Aula("Trabalhadno com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 19));
        //aulas.add(new Aula("Trabalhadno com ArrayList", 21));
        System.out.println(javaColecoes.getAulas());
    }
}
