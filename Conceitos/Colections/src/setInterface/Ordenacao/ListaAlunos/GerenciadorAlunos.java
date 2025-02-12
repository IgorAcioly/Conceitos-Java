package setInterface.Ordenacao.ListaAlunos;


import java.sql.SQLOutput;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import setInterface.Ordenacao.ListaAlunos.Aluno.ComparatorAlunoNota;


public class GerenciadorAlunos implements Comparable<Aluno> {

    //Atributos
    Set<Aluno> alunosSet;

    //Construtor
    public GerenciadorAlunos() {
        this.alunosSet = new TreeSet<>();
    }

    //Métodos
    protected void adicionarAluno(String nome, double nota, String matricula) {
        alunosSet.add(new Aluno(nome, nota, matricula));
    }

    protected Set<Aluno> removerAluno(String matricula) {
        Set<Aluno> alunosRemover = new HashSet<>();
        if (!alunosSet.isEmpty()) {
            for (Aluno a : alunosSet) {
                if (a.getMatricula().equalsIgnoreCase(matricula)) {
                    alunosRemover.add(a);
                }
            }
            alunosSet.removeAll(alunosRemover);
        }
        return alunosSet;
    }

    protected Set<Aluno> exibirAlunosNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>();
        return alunosPorNome;
    }

    protected Set<Aluno> exibirAlunosNotas() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorAlunoNota());
        return alunosPorNota;
    }

    protected Set<Aluno> exibirAlunos() {
        return alunosSet;
    }

    //Método Main
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Marcio",9,"R35B");
        gerenciadorAlunos.adicionarAluno("Alessandra",8.75,"R78B");
        gerenciadorAlunos.adicionarAluno("Diego",7.6,"R21B");

        System.out.println(gerenciadorAlunos.exibirAlunosNome());
        gerenciadorAlunos.removerAluno("R35B");
        System.out.println(gerenciadorAlunos.exibirAlunos());
    }

    @Override
    public int compareTo(Aluno o) {
        return 0;
    }
}