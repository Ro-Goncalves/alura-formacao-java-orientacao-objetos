package curso.java8;

public class Curso {
    private String nome;
    private Integer alunos;

    public Curso (String nome, Integer alunos){
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAlunos() {
        return alunos;
    }
}
