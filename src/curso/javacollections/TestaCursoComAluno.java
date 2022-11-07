package curso.javacollections;

import java.util.Iterator;
import java.util.Set;

import curso.javacollections.classes.Aluno;
import curso.javacollections.classes.Aula;
import curso.javacollections.classes.Curso;

public class TestaCursoComAluno {
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

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        System.out.println("O Aluno: " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno nomeBusca = new Aluno("Rodrigo Gonçalves", 1);
        System.out.println("Procura com equals(): " + a1.equals(nomeBusca));
        System.out.println("Procura com contains(): " + javaColecoes.estaMatriculado(nomeBusca));

        Set<Aluno> setAlunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = setAlunos.iterator();
        
        while (iterador.hasNext()) {
            System.out.println("O próximo é: " + iterador.next());
        }

    }
}
