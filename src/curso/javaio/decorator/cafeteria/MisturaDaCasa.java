package curso.javaio.decorator.cafeteria;

public class MisturaDaCasa implements Bebida{

    private String descricao;
    private Double preco;

    public MisturaDaCasa() {
        this.descricao = "Café mistura da casa";
        this.preco = 3.15;
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
