package mapInterface.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //Atributo
    Map<Integer, String> contatosMap;

    //Construtor
    public AgendaContatos(){
        this.contatosMap = new HashMap<>();
    }

    //Métodos
    protected void adicionarNContato(String nome, Integer telefone){
        contatosMap.put(telefone,nome);
    }
    protected void removerContato(String nome){
       contatosMap.remove(nome);
    }
    protected void exibirContatos(){
        System.out.println(contatosMap);
    }
    protected void pesquisaPorNome(String nome){
        for()

    }



}
