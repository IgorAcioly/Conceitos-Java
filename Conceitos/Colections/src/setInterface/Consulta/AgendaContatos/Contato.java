package setInterface.Consulta.AgendaContatos;

public class Contato {

    //Atributos
    String nome;
    int numeroTelefone;

    //Construtor
    public Contato(String nome, int numeroTelefone){
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    //Getter
    public String getNome(){
        return nome;
    }
    public int getNumeroTelefone(){
        return numeroTelefone;
    }

    //Setter
    public void setNumeroTelefone(int numeroTelefone){
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString(){
        return "{" + nome + "," + numeroTelefone + "}";
    }
}
