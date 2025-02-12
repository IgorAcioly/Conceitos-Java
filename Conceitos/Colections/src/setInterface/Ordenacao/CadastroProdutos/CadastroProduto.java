package setInterface.Ordenacao.CadastroProdutos;


import java.util.Set;
import java.util.TreeSet;
import setInterface.Ordenacao.CadastroProdutos.Produto.ComparatorPorPreco;

 public class CadastroProduto {
    //Atributos
    Set<Produto> produtosSet;

    //Construtor
    public CadastroProduto(){
        this.produtosSet = new TreeSet<>();
    }

    ComparatorPorPreco comparator = new ComparatorPorPreco();

    //Métodos
    protected void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtosSet.add(new Produto(codigo,nome,preco,quantidade));
    }

    protected Set<Produto> exibirProdutosPorNome(){
        return produtosSet;
    }

    protected Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!produtosSet.isEmpty()) {
            produtosPorPreco.addAll(produtosSet);
            return produtosPorPreco;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    //Métod Main
    public static void main (String[] args){
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(135,"Manteiga",7.00, 1);
        cadastroProduto.adicionarProduto(123,"Leite",12.94, 2);
        cadastroProduto.adicionarProduto(97,"Ovos",21.00, 1);

        System.out.println("Produtos por preço: \n"+cadastroProduto.exibirProdutoPorPreco());
        System.out.println("Produtos em ordem alfabética: \n"+cadastroProduto.exibirProdutosPorNome());

    }
 }