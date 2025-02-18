package mapInterface.Ordenacao.AgendaEventos;

public class Evento {
    String nomeEvento;
    String nomeAtracao;

    protected Evento(String nomeEvento, String nomeAtracao){
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    protected String getNomeEvento(){
        return nomeEvento;
    }
    protected String getNomeAtracao(){
        return nomeAtracao;
    }

    @Override
    public String toString(){
        return "{"+nomeEvento+","+nomeAtracao+"}";
    }

}
