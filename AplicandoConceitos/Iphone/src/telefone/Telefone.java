package telefone;

import java.util.Scanner;

public class Telefone implements Discador{

    Scanner scan = new Scanner (System.in);

    @Override
    public void discarChamada(){
        System.out.println("Digite o número desejado: ");
            int discar = scan.nextInt();
            boolean ligar = true;
        System.out.println("Ligando para "+ discar+"Usando Telefone "+ligar);
    }

}
