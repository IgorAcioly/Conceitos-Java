package list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable <Pessoa>{
    //atributos
    String nome;
    int idade;
    double altura;

    //Construtor
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //Getters
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getAltura(){
        return altura;
    }

    //Método comparaçãoIdade
        public int compareTo(Pessoa p) {
            return Integer.compare(idade, p.getIdade());
        }


    //Método ToString
    public String toString(){
        return "\n--------------\n"+
                "Nome: "+ nome +
                "\n Idade: "+ idade +
                "\n Altura: "+altura;
    }


}
