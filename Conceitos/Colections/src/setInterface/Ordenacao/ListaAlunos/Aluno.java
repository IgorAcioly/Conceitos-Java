package setInterface.Ordenacao.ListaAlunos;

import setInterface.Ordenacao.CadastroProdutos.Produto;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    //Atributos
    String nome;
    double nota;
    String matricula;

    //Construtor
    public Aluno (String nome, double nota, String matricula){
        this.nome = nome;
        this.nota = nota;
        this.matricula = matricula;
    }

    //Getter
    protected String getNome(){
        return nome;
    }
    protected double getNota(){
        return nota;
    }
    protected String getMatricula(){
        return matricula;
    }

    //Método de Ordenação
    @Override
    public int compareTo(Aluno a){
        return this.getNome().compareToIgnoreCase(a.getNome());
    }
    public boolean equals(Object o){
        if (this==o) {return true;}
        if (!(o instanceof Aluno aluno)){ return false;};
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    //toString
    public String toString (){
        return "{"+"Nome:"+nome+"Nota: "+nota+"Matrícula: "+matricula+"}";
    }

    public static class ComparatorAlunoNota implements Comparator<Aluno>{
        public int compare (Aluno a1, Aluno a2){
            return Double.compare(a1.getNota(),a2.getNota());
        }
    }
}
