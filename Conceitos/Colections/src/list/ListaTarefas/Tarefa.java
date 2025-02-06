package list.ListaTarefas;

public class Tarefa {
    private String descricao;

    //Construtor
    public Tarefa (String descricao){
        this.descricao = descricao;

    }
    //Getter
    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString(){
        return descricao;
    }
}
