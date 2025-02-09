package list.CatalogoLivros;

public class Livro {

    String titulo;
    String autor;
    int anoPublicacao;

    //Construtor
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    //Getter
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + " // Autor:" + autor;
    }

}
