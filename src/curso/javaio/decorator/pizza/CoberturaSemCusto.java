package curso.javaio.decorator.pizza;

public class CoberturaSemCusto extends Extra{

    public CoberturaSemCusto(String label, Double preco, Pedido pedido) {
        super(label, preco, pedido);
    }

    @Override
    public Double getPreco() {
        return pedido.getPreco();
    }
    
}
