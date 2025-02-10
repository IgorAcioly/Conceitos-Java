package musica;
import java.util.Scanner;

public class IPod implements Reprodutor { 

    Scanner scan = new Scanner(System.in);

    @Override
    public void tocarMusica() {
        System.out.println("Escolha sua música: ");
        String nomeMusica = scan.next();
        System.out.println("Tocando Música: "+ nomeMusica);
    }
    public void mudarVolume() {
        System.out.println("Defina o volume: ");
                int volume = scan.nextInt();
        System.out.println("O volume atual é: "+volume);
 
    }
}
