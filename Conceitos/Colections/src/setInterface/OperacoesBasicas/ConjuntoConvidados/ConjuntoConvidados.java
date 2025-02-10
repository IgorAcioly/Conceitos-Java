package setInterface.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    //Atributos
    Set<Convidado> convidadosSet;

    //Construtor
    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }

    //Método adicionarConvidado
    public void adicionarConvidado(String nomeConvidado,int codigoConvite){
        convidadosSet.add(new Convidado(nomeConvidado, codigoConvite));
    }

    //Método removerConvidado
    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;
        if (!convidadosSet.isEmpty()){
            for (Convidado c : convidadosSet){
                if (c.getCodigoConvite()==codigoConvite){
                    convidadoParaRemover = c;
                    convidadosSet.remove(convidadoParaRemover);
                    System.out.println("O convidado: "+c.getNomeConvidado()+" foi removido da lista");
                    break;
                }
            }
        }else{
            throw new RuntimeException("Conjunto vazio!");
        }
    }

    //Método contarConvidados
    public int contarConvidados(){
        return convidadosSet.size();
    }

    //Método exibirConvidados
    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    //Main
    public static void main (String [] args){
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        //Implementação métodos
        conjuntoConvidados.adicionarConvidado("Igor",123);
        conjuntoConvidados.adicionarConvidado("Maria",148);

        conjuntoConvidados.exibirConvidados();
        System.out.println("\nAtualmente há: "+conjuntoConvidados.contarConvidados()+" convidados\n");
        conjuntoConvidados.removerConvidado(148);
        System.out.println("\nAtualmente há: "+conjuntoConvidados.contarConvidados()+" convidados");
        conjuntoConvidados.exibirConvidados();



    }
}

