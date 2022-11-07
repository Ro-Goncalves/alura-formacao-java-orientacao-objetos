package curso.javaio.decorator.pizza;

public class CoberturaExtraDupla extends Extra{

    public CoberturaExtraDupla(String label, Double preco, Pedido pedido) {
        super(label, preco, pedido);
    }

    @Override
    public Double getPreco() {
        return (this.preco * 2) + pedido.getPreco();
    }

    @Override
    public String getLabel(){
        return pedido.getLabel() + ", Dupla " + this.label;
    }
    
}
