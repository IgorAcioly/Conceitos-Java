package setInterface.OperacoesBasicas.ConjuntoPalavrasUnicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    //Atributos
     Set<String> palavrasUnicas;

    //Construtor
    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicas = new HashSet<>();
    }

    //Método adicionarPalavra
    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    //Método removerPalavra
    public void removerPalavra(String palavra) {
        if (!palavrasUnicas.isEmpty()) {
            if (palavrasUnicas.contains(palavra)) {
                palavrasUnicas.remove(palavra);
                System.out.println("A palavra "+palavra+" foi removida da lista");
            }
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    //Método consultarPalavra
    public String verificarPalavra(String palavra){
        if (!palavrasUnicas.isEmpty()) {
            if (palavrasUnicas.contains(palavra)){
                System.out.println(palavra+" está presente na lista");
            }
            return palavra;
        }else{
            throw new RuntimeException("Lista vaiza!");
        }
    }

    //Método exibirPalavras
    public void exibirPalavras(){
        System.out.println("A lista contem: "+palavrasUnicas);
    }

    //Método main
    public static void main (String [] args){
        //Instância do objeto
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        conjuntoPalavras.adicionarPalavra("Cavalo");
        conjuntoPalavras.adicionarPalavra("Vaca");
        conjuntoPalavras.adicionarPalavra("Zebra");

        conjuntoPalavras.exibirPalavras();
        conjuntoPalavras.removerPalavra("Vaca");
        conjuntoPalavras.verificarPalavra("Zebra");
        conjuntoPalavras.exibirPalavras();


    }

}
