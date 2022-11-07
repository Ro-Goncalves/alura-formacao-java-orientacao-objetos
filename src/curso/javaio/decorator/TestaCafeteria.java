package curso.javaio.decorator;

import curso.javaio.decorator.cafeteria.Bebida;
import curso.javaio.decorator.cafeteria.Cobertura;
import curso.javaio.decorator.cafeteria.Expresso;

public class TestaCafeteria {
    public static void main(String[] args) {
        Bebida expresso = new Expresso();
        System.out.println(expresso.getDescricao() + " -> Valor: " + expresso.getPreco());

        expresso = new Cobertura(expresso, "Caramelo", 1.0);
        System.out.println(expresso.getDescricao() + " -> Valor: " + expresso.getPreco());

        expresso = new Cobertura(expresso, "Chocolate", 1.3);
        System.out.println(expresso.getDescricao() + " -> Valor: " + expresso.getPreco());
       
    }
}
