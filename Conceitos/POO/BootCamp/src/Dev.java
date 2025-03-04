import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosVigentes = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluido = new LinkedHashSet<>();
    private Set<Bootcamp> bootcampsInscrito = new LinkedHashSet<>();
    private Set<Bootcamp> bootcampsConcluidos = new LinkedHashSet<>();


    public Dev(String nome) {
        this.nome = nome;
    }

    protected void inscreverBootcamp(Bootcamp b){
        bootcampsInscrito.add(b);
        conteudosVigentes.addAll(b.getConteudos());
        b.getDevInscritos().add(this);
    }
    protected void progredir(){
        Optional<Conteudo> conteudo = this.conteudosVigentes.stream().findFirst();
        if (conteudo.isPresent()) {
            conteudosVigentes.remove(conteudo.get());
            conteudosConcluido.add(conteudo.get());
        } else {
            throw new RuntimeException ("Não é possível progredir, o Bootcamp informado não está cadastrado ");
        }
    }
    protected void concluir(Bootcamp b) {
        if (bootcampsInscrito.contains(b)) {
            bootcampsInscrito.remove(b);
            bootcampsConcluidos.add(b);
        } else {
            throw new RuntimeException("Não é possível progredir, o Bootcamp informado não está cadastrado ");
        }
    }
    protected double calcularTotalXp(){
        return this.conteudosVigentes.stream()
                                     .mapToDouble(Conteudo::calcularXp)
                                     .sum();
    }

    protected void exibirCursos(){
        System.out.println(conteudosVigentes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosConcluido() {
        return conteudosConcluido;
    }

    public void setConteudosConcluido(Set<Conteudo> conteudosConcluido) {
        this.conteudosConcluido = conteudosConcluido;
    }

    public Set<Conteudo> getConteudosVigentes() {
        return conteudosVigentes;
    }

    public void setConteudosVigentes(Set<Conteudo> conteudosVigentes) {
        this.conteudosVigentes = conteudosVigentes;
    }

    public Set<Bootcamp> getBootcampsInscrito() {
        return bootcampsInscrito;
    }

    public void setBootcampsInscrito(Set<Bootcamp> bootcampsInscrito) {
        this.bootcampsInscrito = bootcampsInscrito;
    }

    public Set<Bootcamp> getBootcampsConcluidos() {
        return bootcampsConcluidos;
    }

    public void setBootcampsConcluidos(Set<Bootcamp> bootcampsConcluidos) {
        this.bootcampsConcluidos = bootcampsConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosVigentes, dev.conteudosVigentes) && Objects.equals(conteudosConcluido, dev.conteudosConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosVigentes, conteudosConcluido);
    }
    public String toString(){
        return nome ;
    }

}
