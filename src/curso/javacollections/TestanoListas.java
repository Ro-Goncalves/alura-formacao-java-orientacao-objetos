package curso.javacollections;

import java.util.ArrayList;
import java.util.Collections;

public class TestanoListas {
    public static void main(String[] args) {
        String aula1 = "Conhcendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add("Aula primeira");

        System.out.println(aulas);
        
        aulas.remove(0);
        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Nome Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);

        //Lenta
        for(int i = 0; i < aulas.size(); i++){
            System.out.println("Aulas: " + aulas.get(i));
        }

        //Mais elegante, garante paralemismo
        aulas.forEach(aula -> {
            System.out.println("ForEach aula: " + aulas);
        });

        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
