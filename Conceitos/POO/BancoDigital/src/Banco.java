package BancoDigital.src;

import java.util.LinkedList;
import java.util.List;
import static java.lang.Double.MAX_VALUE;

public class Banco {
    List<Conta> contaList = new LinkedList<>();

    protected void adicionarContaPoupanca(Conta conta) {
        contaList.add(conta);
    }

    protected void adicionarContaCorrente(Conta conta) {
        contaList.add(conta);
    }

    protected void contaMaisValiosa() {
        Conta clienteMaisValioso = null;
        Double minValue = Double.MIN_VALUE;
        if(!contaList.isEmpty()){
            for (Conta c : contaList) {
                if (c.getSaldo() > minValue) {
                    minValue = c.getSaldo();
                    clienteMaisValioso = c;
                }
            }
        } else {
            throw new RuntimeException("Lista vazia");
        }
        System.out.println("Conta mais valiosa: "+clienteMaisValioso);
    }

    protected void exibirLista(){
        if(!contaList.isEmpty()){
                System.out.println("\nLista de Contas Ativas: \n"+contaList);
        }
    }

    protected void contaMenosValiosa () {
        Conta clienteMenosValioso = null;
        if (!contaList.isEmpty()) {
            Double maxValue = MAX_VALUE;
            for (Conta c : contaList) {
                if (c.getSaldo() < maxValue) {
                    maxValue = c.getSaldo();
                    clienteMenosValioso = c;
                }
            }
        }
        System.out.println("Conta menos valiosa: "+clienteMenosValioso);
    }

    protected void exibirCliente(String nome){
       Conta clienteBuscado = null;
        if(!contaList.isEmpty()){
            for(Conta c: contaList){
                if(c.getNome().equalsIgnoreCase(nome)){
                    clienteBuscado = c;
                }
            }
        }
        System.out.println("Cliente encontrado: "+clienteBuscado);
     }

}
