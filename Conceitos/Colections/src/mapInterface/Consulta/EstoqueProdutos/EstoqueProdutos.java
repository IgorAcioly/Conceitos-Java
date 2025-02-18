package mapInterface.Consulta.EstoqueProdutos;

import java.util.LinkedHashMap;
import java.util.Map;

public class EstoqueProdutos {

    Map<Long, Produto> estoqueMap;

    protected EstoqueProdutos(){
        this.estoqueMap=new LinkedHashMap<>();
    }

    protected void adicionarProduto (Long codigo, String nome, int quantidade, double preco){
        estoqueMap.put(codigo,new Produto(nome,quantidade,preco));
    }
    protected void exibirProduto(){
        System.out.println(estoqueMap);
    }
    protected double calcularValorTotalEstoque(){
        double valorTotal = 0;

        if(!estoqueMap.isEmpty()){
            for (Produto p : estoqueMap.values()){
                valorTotal = p.getPreco() * p.getQuantidade();
            }
        }else{
            System.out.println("Lista vazia!");
        }
        return valorTotal;
    }
    protected Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                if (p.getPreco() > maiorValor) {
                    maiorValor = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        } return produtoMaisCaro;
    }
    protected Produto obterProdutoMaisBarato(){
            Produto produtoMaisBarato = null;
            double menorValor = Double.MAX_VALUE;

            if(!estoqueMap.isEmpty()){
                for (Produto p : estoqueMap.values()){
                    if(p.getPreco()<menorValor){
                        menorValor = p.getPreco();
                        produtoMaisBarato = p;
                    }
                }
            }return produtoMaisBarato;
        }
        protected Produto obterProdutoMaisCaroQuantidade(){
            Produto produtoMaiorQuantidadeValorNoEstoque  = null;
            double maiorValorTotal = Double.MIN_VALUE;

            if(!estoqueMap.isEmpty()){

                //Manipulando elementos Map
                for (Map.Entry<Long, Produto> entry : estoqueMap.entrySet()){
                    double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                    if(valorProdutoEmEstoque > maiorValorTotal){
                        maiorValorTotal = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                        produtoMaiorQuantidadeValorNoEstoque  = entry.getValue();
                    }
                }
            }return produtoMaiorQuantidadeValorNoEstoque ;
        }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(12345L,"Leite",2,7.80);
        estoque.adicionarProduto(18965L,"Açúcar",3,7.81);
        estoque.adicionarProduto(15343L,"Suco",3,3.50);
        estoque.adicionarProduto(15795L,"Manteiga",5,5.30);

        estoque.exibirProduto();
        System.out.println(estoque.calcularValorTotalEstoque());
        System.out.println("O produto mais caro do estoque é: "+estoque.obterProdutoMaisCaro());
        System.out.println("O produto mais barato do estoque é: "+estoque.obterProdutoMaisBarato());
        System.out.println("Produto com maior valor em quantidade é :"+estoque.obterProdutoMaisCaroQuantidade());

        }
    }

