package list.CatalogoLivros;
import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    //Criando Lista
    public List<Livro> livrosList;

    //Construtor
    public CatalogoLivros(){
        this.livrosList = new ArrayList<>();
    }

    //Método adicionarLivros
    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //Método pesquisarPorAutor
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaAutores = new ArrayList<>();

        if (!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    listaAutores.add(l);
                }
            }
        }
        return listaAutores;
    }

    //Método pesquisarPorIntervaloAnos
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaIntervaloAnos = new ArrayList<>();

        if(!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    listaIntervaloAnos.add(l);
                }
            }
        }
        return listaIntervaloAnos;
    }

    //Método pesquisarPorTitulo
    public String pesquisarPorTitulo(String titulo){
        String tituloPesquisa = null;

        if (!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    tituloPesquisa = titulo;
                }
            }
        }
        return tituloPesquisa;
    }

    //Método main
    public static void main (String [] args){
        CatalogoLivros catalogo = new CatalogoLivros();

        //Implementando Elementos na lista
        catalogo.adicionarLivros("Mobydick","Fernando Pessoa",1974);
        catalogo.adicionarLivros("Harry Potter","Machado de Assis",2005);

        //Implementando Métodos de Pesquisa
        System.out.println("Pesquisando por Autor: " + catalogo.pesquisarPorAutor("Fernando Pessoa"));
        System.out.println("Pesquisando por Intervalo: " + catalogo.pesquisarPorIntervaloAnos(1973,2021));
        System.out.println("Pesquisando por Título: " + catalogo.pesquisarPorTitulo("MobyDick"));

    }
}
