package curso.javaio.decorator;

import curso.javaio.decorator.pizza.CoberturaExtraDupla;
import curso.javaio.decorator.pizza.Pedido;
import curso.javaio.decorator.pizza.Pizza;
import curso.javaio.decorator.pizza.UmaCoberturaExtra;

public class TestaPizza {
    public static void main(String[] args) {
        Pedido pizzaDaCasa = new Pizza("Pizza da casa", 10.00);
        //System.out.println("Nome da Pizza: " + pizzaDaCasa.getLabel() + "\n");
        
        pizzaDaCasa = new UmaCoberturaExtra("Peperoni", 4.00, pizzaDaCasa);
        //System.out.println("Nome da Pizza: " + pizzaDaCasa.getLabel() + "\n");

        pizzaDaCasa = new CoberturaExtraDupla("Mozzarella", 4.0, pizzaDaCasa);
        //System.out.println("Nome da Pizza: " + pizzaDaCasa.getLabel() + "\n");
        
        pizzaDaCasa = new CoberturaExtraDupla("Mozzarella", 4.0, pizzaDaCasa);
        System.out.println("Nome da Pizza: " + pizzaDaCasa.getLabel() + 
                            " Valor da Pizza: " + pizzaDaCasa.getPreco() + "\n");

    }
}
