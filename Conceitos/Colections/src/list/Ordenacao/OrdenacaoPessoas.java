package list.Ordenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import list.Ordenacao.ComparatorPorAltura;

public class OrdenacaoPessoas {

    List<Pessoa> pessoaList = new ArrayList<>();

    //Método Construtor
    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    //Método exibirPessoas
    public List<Pessoa> exibirPessoas(){
        return pessoaList;
    }

    //Método adicionar pessoas
    public void adicionarPessoas(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    //Método ordenarPorIdade
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);

        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    //Método ordenarPorAltura
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);

        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
        throw new RuntimeException("Lista Vazia!");
    }
}

    //Método main
    public static void main (String [] args){
        OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();

        ordenacaoPessoa.adicionarPessoas("Igor",20, 1.98);
        ordenacaoPessoa.adicionarPessoas("Antonio",34, 1.78);
        ordenacaoPessoa.adicionarPessoas("Carlos",98,1.54);
        System.out.println("\n A lista de pessoas é: \n"+ordenacaoPessoa.exibirPessoas());
        System.out.println("\n A ordem de idade é: \n"+ordenacaoPessoa.ordenarPorIdade());
        System.out.println("\n A ordem de altura é: \n"+ordenacaoPessoa.ordenarPorAltura());


    }

}
