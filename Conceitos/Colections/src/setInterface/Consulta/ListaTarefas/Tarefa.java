package setInterface.Consulta.ListaTarefas;

class Tarefa {
    //Atributos
    String descricao;
    Boolean status = false;

    //Construtor
    protected Tarefa(String descricao){
        this.descricao = descricao;
    }

    //Getters
    protected String getDescricao(){
        return descricao;
    }
    protected Boolean getStatus(){
        return status;
    }

    //Setter
    protected void setStatus(Boolean status){
        this.status = status;
    }

    @Override
    public String toString(){
        return "{" + descricao + "," + status + "}";
    }

}
