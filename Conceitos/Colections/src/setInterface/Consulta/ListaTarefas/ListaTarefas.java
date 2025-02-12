package setInterface.Consulta.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

class ListaTarefas {

    //Atributos
    Set<Tarefa> tarefasSet;

    //Construtor
    public ListaTarefas(){
        this.tarefasSet = new HashSet<>();
    }

    //Métodos
    protected void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa (descricao));
    }

    protected void removerTarefa(String descricao) {
        Set<Tarefa> tarefasRemover = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasRemover.add(t);
                }
            }
            tarefasSet.removeAll(tarefasRemover);
        }else{
            throw new RuntimeException("Lista vazia");
        }
    }

    protected void exibirTarefa(){
        Set<Tarefa> tarefaExibir = new HashSet<>(tarefasSet);
        if (!tarefaExibir.isEmpty()){
            System.out.println(tarefaExibir);
        }
        else {
            System.out.println("Lista Vazia!");
        }
    }

    protected int contarTarefas(){
        return tarefasSet.size();
    }

    private void marcarConcluida(String descricao) {
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setStatus(true);
            }
        }
    }

    protected void  marcarPendente(String descricao) {
        if (!tarefasSet.isEmpty()){
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setStatus(false);
                }
            }
        }else{
            throw new RuntimeException ("Elemento não encontrado");
        }
    }

    protected Set<Tarefa> tarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if (t.getStatus()==true){
                    tarefasConcluidas.add(t);
                }
            }
            return tarefasConcluidas;
        }else{
                throw new RuntimeException("Lista vazia!");
            }
        }

    protected Set<Tarefa> tarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getStatus() == false) {
                    tarefasPendentes.add(t);
                }
            }
            return tarefasPendentes;
        } else{
            throw new RuntimeException("Lista vazia!");
        }
    }

    protected void limparTarefas(){
        tarefasSet.clear();
        }

        //Métod main
    public static void main (String [] args){
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Acordar");
        listaTarefas.adicionarTarefa("Escovar os dentes");
        listaTarefas.adicionarTarefa("Oração");
        listaTarefas.adicionarTarefa("Café da manhã");

        listaTarefas.marcarConcluida("Café da manhã");
        listaTarefas.exibirTarefa();
        System.out.println("\nA lista possui: "+listaTarefas.contarTarefas()+" itens\n");
        System.out.println(listaTarefas.tarefasPendentes());
        System.out.println(listaTarefas.tarefasConcluidas());

        listaTarefas.marcarConcluida("Oração");
        listaTarefas.removerTarefa("Acordar");
        listaTarefas.exibirTarefa();

        listaTarefas.limparTarefas();
        listaTarefas.exibirTarefa();


    }
}


