package setInterface.Ordenacao.CadastroProdutos;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    //Atributos
    String nome;
    double preco;
    int quantidade;
    long codigo;

    //Construtor
    public Produto(long codigo,String nome, double preco, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.preco = preco;
    }

    //Getter
    protected String getNome(){
        return nome;
    }
    protected int getQuantidade(){
        return quantidade;

    }protected long getCodigo(){
        return codigo;
    }
    protected double getPreco(){
        return preco;
    }

    //Método de definição de ordem natural / Comparable
    public int compareTo(Produto p){
        return nome.compareToIgnoreCase(p.getNome());
    }

    //Método de Comparação de elementos iguas (Tendo como parâmetro o códigoProd)
    public boolean equals(Object o){
         if (this==o) {return true;}
         if (!(o instanceof Produto produto)){ return false;};
        return getCodigo() == produto.getCodigo();
    }

    //toString
    public String toString(){
        return "{" + "Produto: " + nome + ","
                + "Quantidade: "+quantidade+","
                + "Codigo" + codigo + ","
                + "Preço: " + preco + "}\n";
    }

    public static class ComparatorPorPreco implements Comparator<Produto>{
        @Override
        public int compare (Produto p1, Produto p2){
            return Double.compare(p1.getPreco(),p2.getPreco());
        }
    }

}
