package mapInterface.Consulta.EstoqueProdutos;

public class Produto {
    String nome;
    int quantidade;
    double preco;

    protected Produto (String nome, int quantidade, double preco){
        this.nome=nome;
        this.quantidade=quantidade;
        this.preco=preco;
    }

    protected String getNome(){
        return nome;
    }
    protected int getQuantidade(){
        return quantidade;
    }
    protected double getPreco(){
        return preco;
    }

    @Override
    public String toString() {
        return "{"+nome+","+ quantidade+" unidades, R$" + preco+"}";
    }
}
