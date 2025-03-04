import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate dataMentoria;

    @Override
    protected double calcularXp() {
        return XP_PADRAO+10d;
    }

    public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataMentoria = dataMentoria;
    }


    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataMentoria=" + dataMentoria +
                '}';
    }
}
