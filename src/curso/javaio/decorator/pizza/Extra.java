package curso.javaio.decorator.pizza;

public abstract class Extra implements Pedido{
    
    protected Pedido pedido;
    protected String label;
    protected Double preco;

    public Extra(String label, Double preco, Pedido pedido){
        this.pedido = pedido;
        this.label = label;
        this.preco = preco;
    }

    //Delega para a implementação concreta
    public abstract Double getPreco();

    public String getLabel(){
        return pedido.getLabel() + ", " + this.label;
    }
        
}
