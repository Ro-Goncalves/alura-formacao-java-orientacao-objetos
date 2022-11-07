package curso.javacollections;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Gonçalves");
        alunos.add("Nico Steppat");
        alunos.add("Alberto Souza");
        alunos.add("Renan Saggio");
        alunos.add("Sergio Lopees");
        alunos.add("Mauricio Aniche");

        System.out.println(alunos);

        for (String string : alunos) {
            System.out.println(string);
        }

        boolean achei = alunos.contains("Kamyla");
        System.out.println(achei);
    }

   
}
