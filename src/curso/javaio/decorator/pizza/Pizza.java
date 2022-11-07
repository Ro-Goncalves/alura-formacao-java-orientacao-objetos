package curso.javaio.decorator.pizza;

public class Pizza implements Pedido{

    private String label;
    private Double preco;

    public Pizza(String label, Double preco){
        this.label = label;
        this.preco = preco;
    }

    @Override
    public Double getPreco() {
        return this.preco;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
    
}
