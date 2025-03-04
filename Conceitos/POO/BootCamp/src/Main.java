import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java","API Restful",10);
        Mentoria mentoria1 = new Mentoria("JS","Front End", LocalDate.of(2027,03,17));
        Bootcamp bootcamp1 = new Bootcamp("SummerCode","Back and Front-End");

        System.out.println("Apresentação inicial");
        //Apresentação inicial individual
        System.out.println(curso1);
        System.out.println(mentoria1);
        System.out.println(bootcamp1);

        //Adicionando conteúdos ao Bootcamp
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria1);

        //Criando usuários
        Dev dev1 = new Dev("Igor");
        Dev dev2 = new Dev("Caila");

        //Inscrevendo usuários ao Bootcamp
        dev1.inscreverBootcamp(bootcamp1);
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("----------------------------------");
        //Exibindo inscrições usuários
        System.out.println("Bootcamps que Igor está inscrito: "+dev1.getBootcampsInscrito());
        System.out.println("Bootcamps que Igor concluiu: "+dev1.getBootcampsConcluidos());
        System.out.println("Conteúdos que Igor está inscrito: "+dev1.getConteudosVigentes());
        System.out.println("Conteúdos que Igor concluiu: "+dev1.getConteudosConcluido());

        //Progredindo conteudos
        dev1.progredir();
        dev2.progredir();

        System.out.println("----------------------------------");
        //Concluindo inscrição de Bootcamps
        dev1.concluir(bootcamp1);

        //Exibindo XP adquirido pelos usuarios
        System.out.println(dev2.getNome()+" possui "+dev2.calcularTotalXp()+" XP");
        System.out.println(dev1.getNome()+" possui "+dev1.calcularTotalXp()+" XP");



        System.out.println("----------------------------------");
        //Exibindo inscrições usuários
        System.out.println("Bootcamps que Igor está inscrito: "+dev1.getBootcampsInscrito());
        System.out.println("Bootcamps que Igor concluiu: "+dev1.getBootcampsConcluidos());
        System.out.println("Conteúdos que Igor está inscrito: "+dev1.getConteudosVigentes());
        System.out.println("Conteúdos que Igor concluiu: "+dev1.getConteudosConcluido());





    }
}
