package curso.javacollections.classes;

public class Aluno {
    private String nome;
    private Integer matricula;
   
    public Aluno(String nome, Integer matricula){
        if(nome == null){
            throw new NullPointerException("nome não pode ser nulo");
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.matricula + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno) obj;
        return this.nome.equals(aluno.getNome() );
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
