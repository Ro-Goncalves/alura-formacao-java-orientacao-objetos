package curso.javaio.decorator.cafeteria;

public abstract class DecoratorExpresso implements Bebida{

    protected Bebida bebida;
    protected String descricao;
    protected Double preco;

    public DecoratorExpresso(Bebida bebida, String descricao, Double preco) {
        this.bebida = bebida;
        this.descricao = descricao;
        this.preco = preco;
    }

    public abstract Double getPreco();

    public String getDescricao(){
        return bebida.getDescricao() + ", " + this.descricao;
    }

}
