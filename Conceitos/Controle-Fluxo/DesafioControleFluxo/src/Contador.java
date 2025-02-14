import java.util.Scanner;

public class Contador {

    //Atributos

    //Construtor

    //Métodos
    protected void contar (int p1, int p2) throws ParametrosInvalidosException{
        if (p1>p2) {
            throw new ParametrosInvalidosException("ERRO! Parâmetro 1 não pode ser menor que o 2º parâmetro");
        }
            for (int i = p1; i<=p2; i++){
                System.out.println("A contagem está em: "+i);
            }
    }
    //Main
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        Contador contador = new Contador();

        int p1=0;
        int p2=0;

        System.out.println("Insira o parâmetro 1: ");
        p1 = scan.nextInt();
        System.out.println("Insira o parâmetro 2: ");
        p2 = scan.nextInt();


        try{
            contador.contar(p1,p2);
        }
        catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }



    }

}