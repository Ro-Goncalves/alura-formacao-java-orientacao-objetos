package curso.javacollections.classes;

public class Aula implements Comparable<Aula> {
    
    private String titulo;
    private Integer tempo;

    public Aula(String titulo, Integer tempo){
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public Integer getTempo() {
        return tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {        
        return "[Aula: " + this.titulo + " - Tempo: " + this.tempo + " minutos]" ;
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }

}
