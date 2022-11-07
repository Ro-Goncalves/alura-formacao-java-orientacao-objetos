package curso.javacollections;

import curso.javacollections.classes.Aluno;
import curso.javacollections.classes.Aula;
import curso.javacollections.classes.Curso;

public class TesteBuscaAlunos {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
        "Rodrigo Gonçalves");

        javaColecoes.adiciona(new Aula("Trabalhadno com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 19));

        Aluno a1 = new Aluno("Rodrigo Gonçalves", 1);
        Aluno a2 = new Aluno("Alan Alado", 2);
        Aluno a3 = new Aluno("José Ze", 3);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);

        System.out.println("Quem é o aluno com matrícula 2?");
        Aluno alunoMatricuado = javaColecoes.buscaMatriculado(2);
        System.out.println(alunoMatricuado.getNome());
    }
}
