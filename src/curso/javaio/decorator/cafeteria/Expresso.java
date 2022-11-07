package curso.javaio.decorator.cafeteria;

public class Expresso implements Bebida{

    private String descricao;
    private Double preco;

    public Expresso(){
        this.descricao = "Café Expresso";
        this.preco = 2.25;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public Double getPreco() {
        return this.preco;
    }
    
   
}
