package list.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //Atributo List
    private List<Item> carrinho;

    //Construtor
    public CarrinhoDeCompras(){
        this.carrinho= new ArrayList<>();
    }

    //Método Adicionar
    public void adicionarItem (String nome, double preco, int quantidade){
        carrinho.add(new Item(nome,preco,quantidade));
    }

    //Método Remover
    public void removerItem (String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinho.isEmpty()) {
            for (Item i : carrinho) {
                if (i.getItemNome().equalsIgnoreCase(nome))
                {
                    itensParaRemover.add(i);
                }else{
                    System.out.println("Item não encontrado");
                }
            }
            carrinho.removeAll(itensParaRemover);
        }
        else{
            System.out.println("Lista vazia!");
            }
    }

    //Método Valor Total
    public double valorTotal(){
        double total = 0;
        if (!carrinho.isEmpty()){
            for  (Item i : carrinho){
                double valorItens = i.getItemQuantidade() * i.getItemPreco();
                total += valorItens;
            }
            return total;
        }else{
            throw new RuntimeException("Lista vazia");
        }
    }

    //Método Exibir
    public String exibirItens(){
        Item i;
        System.out.println(carrinho);
        return carrinho.toString();

    }

    //Método Main
  public static void main (String [] args){
        CarrinhoDeCompras carrinhoCompras = new CarrinhoDeCompras();

        //Implementando métodos
        carrinhoCompras.adicionarItem("Geleia",5.3,1);
        carrinhoCompras.adicionarItem("Iogurte",7.0,2);
        carrinhoCompras.exibirItens();
      System.out.println("O valor total do carrinho é: "+ carrinhoCompras.valorTotal());

  }

}
