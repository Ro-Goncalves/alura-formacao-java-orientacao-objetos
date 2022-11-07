package curso.javaio.decorator.pizza;

public class UmaCoberturaExtra extends Extra{
    
    public UmaCoberturaExtra(String label, Double preco, Pedido pedido) {        
        super(label, preco, pedido);        
    }

    @Override
    public Double getPreco() {
        return this.preco + pedido.getPreco();
    }
    
}
