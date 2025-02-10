package list.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    //Atributo
    private List<Tarefa> tarefaList;

    //Construtor
    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    //****Como não dar erro?
    public void adicionarTarefa (String descricao){
        tarefaList.add(new Tarefa (descricao));
    }

    //Método
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (!tarefaList.isEmpty()) {
            System.out.println(tarefaList);
            for (Tarefa t : tarefaList) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    //Método
    public int totalTarefas() {
        return tarefaList.size();
    }

    //Método
    public void descricoesTarefas() {
        if (!tarefaList.isEmpty()) {
            System.out.println(tarefaList);
        } else {
            System.out.println("Lista vazia!");
        }

    }
    public static void main (String [] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.removerTarefa("Tarefa 1");
        listaTarefa.descricoesTarefas();
        listaTarefa.totalTarefas();
    }
}


