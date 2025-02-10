package setInterface.OperacoesBasicas.ConjuntoConvidados;


public class Convidado {
    //Atributos
    String nomeConvidado;
    int codigoConvite;

    //Constutor
    public Convidado (String nomeConvidado, int codigoConvite){
        this.nomeConvidado = nomeConvidado;
        this.codigoConvite = codigoConvite;
    }

    //Getters
    public String getNomeConvidado(){
        return nomeConvidado;
    }
    public int getCodigoConvite(){
        return codigoConvite;
    }

    @Override
    public String toString(){
        return "Lista de convidados atualmente: "+"\n--------------" +" \n Nome Convidado: "+ nomeConvidado +
                "\n Código do convite: "+ codigoConvite;
    }
}
