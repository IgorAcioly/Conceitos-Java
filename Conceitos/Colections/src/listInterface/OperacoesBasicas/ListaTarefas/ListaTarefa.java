package list.ListaTarefas;

import java.util.ArrayList;
import java.util.List;
import list.ListaTarefas.Tarefa;


class ListaTarefa {

    //Atributo
    protected List<Tarefa> tarefaList;

    //Construtor
    protected ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    //****Como não dar erro?
    protected void adicionarTarefa (String descricao){
        tarefaList.add(new Tarefa (descricao));
    }

    //Método
    protected void removerTarefa(String descricao) {
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
    protected int totalTarefas() {
        return tarefaList.size();
    }

    //Método
    protected void descricoesTarefas() {
        if (!tarefaList.isEmpty()) {
            System.out.println(tarefaList);
        } else {
            System.out.println("Lista vazia!");
        }

    }
    protected static void main (String [] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.removerTarefa("Tarefa 1");
        listaTarefa.descricoesTarefas();
        listaTarefa.totalTarefas();
    }
}


