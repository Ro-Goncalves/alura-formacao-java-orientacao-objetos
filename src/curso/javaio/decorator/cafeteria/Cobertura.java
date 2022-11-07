package curso.javaio.decorator.cafeteria;

public class Cobertura extends DecoratorExpresso{

    public Cobertura(Bebida bebida, String descricao, Double preco) {
        super(bebida, descricao, preco);
    }

    @Override
    public Double getPreco() {
        return this.preco + bebida.getPreco();
    }
    
}
