package setInterface.Consulta.AgendaContatos;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {

    //Atributos
    HashSet<Contato> contatosSet;

    //Construtor
    public AgendaContatos(){
        this.contatosSet = new HashSet<>();
    }

    //Métodos
    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contato(nome, numero));
    }

    public HashSet<Contato> exibirContato(){
        return contatosSet;
    }

    public HashSet<Contato> pesquisarPorNome(String nome){
        HashSet<Contato> nomesEncontrados = new HashSet<>();
        if(!contatosSet.isEmpty()) {
            for (Contato c : contatosSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    nomesEncontrados.add(c);
                }
            }
            return nomesEncontrados;
        }else{
            throw new RuntimeException("Lista Vazia!");
        }
    }

    public void atualizarNumeroContato (String nome, int numero){
        if(!contatosSet.isEmpty()) {
            for (Contato c : contatosSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumeroTelefone(numero);
                }
            }
        }
    }
    //Main
    public static void main (String [] args){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Walace",123);
        agendaContatos.adicionarContato("Pedro",145);
        agendaContatos.adicionarContato("Jonas",174);

        System.out.println(agendaContatos.exibirContato());
        agendaContatos.pesquisarPorNome("Walace");
        agendaContatos.atualizarNumeroContato("Pedro",333);
        System.out.println(agendaContatos.exibirContato());
    }
}
