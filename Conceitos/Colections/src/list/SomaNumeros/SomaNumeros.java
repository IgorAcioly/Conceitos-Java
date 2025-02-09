package list.SomaNumeros;
import java.util.ArrayList;
import java.util.List;


public class SomaNumeros {
    List<Integer> listaNumeros;

    //Construtor
    public SomaNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    //Método AdicionarNumero
    public void adicionarNumero(int numero){
      listaNumeros.add(new Integer(numero));
    }

    //Método calcularSoma
    public int calcularSoma(){
        List<Integer> listaSoma = new ArrayList<>();
        int numeroSoma = 0;
        if (!listaNumeros.isEmpty()){
            for (Integer n : listaNumeros){
               numeroSoma += n;
            }
        }
        else{
            throw new RuntimeException("A lista está vazia! ");
        }
        return numeroSoma;
    }

    //Método encontrarMaiorNumero
    public int maiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;

        if (!listaNumeros.isEmpty()){
            for (Integer n : listaNumeros){
                if (n > maiorNumero){
                    maiorNumero = n;
                }
            }
        }else{
            throw new RuntimeException("A lista está vazia! ");
        }
        return maiorNumero;
    }

    //Método encontrarMenorNumero
    public int menorNumero(){
        int menorNumero = Integer.MAX_VALUE;

        if (!listaNumeros.isEmpty()){
            for (Integer n : listaNumeros){
                if (n < menorNumero){
                    menorNumero = n;
                }
            }
        }else{
            throw new RuntimeException("A lista está vazia! ");
        }
        return menorNumero;
    }

    //Método exibirNumeros
    public void exibirNumeros(){
        if (!listaNumeros.isEmpty()){
        System.out.println("Estes são os números da lista: " + listaNumeros);
        }else{
            throw new RuntimeException ("A lista estpa vazia!");
        }
    }

    //Método main
    public static void main (String [] args){
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(9);
        System.out.println("O maior número da lista é: " + somaNumeros.maiorNumero());
        System.out.println("A soma da lista é: "+ somaNumeros.calcularSoma());
        System.out.println("O menor número da lista é: " + somaNumeros.menorNumero());
        somaNumeros.exibirNumeros();
    }
}
