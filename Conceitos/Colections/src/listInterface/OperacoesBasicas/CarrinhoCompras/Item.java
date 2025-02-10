package list.CarrinhoCompras;

public class Item {

    //Declarando atributos
    String nome;
    double preco;
    int quantidade;

    //Construtores
    public Item(String nome, Double preco, int quantidade){
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
    }

    //Getters
    public String getItemNome(){
        return nome;
    }
    public double getItemPreco(){
        return preco;
    }
    public int getItemQuantidade(){
        return quantidade;
    }

    @Override
    public String toString(){
        return nome;
    }

}
