package curso.javacollections.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        //Retorna um objeto não modificável.
        return Collections.unmodifiableList(aulas);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){        
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(this.alunos);
    }

    @Override
    public String toString() {
        return "[Curso : " + this.nome + ", tempo total: " + this.getTempoTotal() + "]";
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int matricula) {
        return matriculaParaAluno.get(matricula);
    }
}
