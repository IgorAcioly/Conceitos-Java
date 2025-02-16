package mapInterface.OperacoesBasicas.AgendaContatos;

import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {

    //Atributo(HashMap)
    Map<String,Integer> contatosMap = new HashMap<>();


    //Métodos
    protected void adicionarContato(String nome, Integer numeroTelefone){
        contatosMap.put(nome,numeroTelefone);
    }

    protected void removerContato(String nome){
        if(!contatosMap.isEmpty()){
            contatosMap.remove(nome);
        }else{
            throw new RuntimeException("A lista está vazia!");
        }

    }

    protected void exibirContatos(){
        System.out.println(contatosMap);
    }

    protected void pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!contatosMap.containsKey(nome)) {
            System.out.println("Contato não encontrado");
        } else {
            numeroPorNome = contatosMap.get(nome);
            System.out.println("Número do contato encontrado: "+numeroPorNome);
        }

    }

    public static void main (String [] args){
        AgendaContatos agendaC = new AgendaContatos();

        agendaC.adicionarContato("Angela",123);
        agendaC.adicionarContato("Italo",234);
        agendaC.adicionarContato("Mariana",173);

        agendaC.exibirContatos();
        agendaC.removerContato("Angela");
        agendaC.exibirContatos();
        agendaC.pesquisarPorNome("Angela");
        agendaC.pesquisarPorNome("Mariana");

    }

}
