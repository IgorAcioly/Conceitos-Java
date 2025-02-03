package navegador;

import java.util.Scanner;

public class Safari implements Navegador{
    Scanner scan = new Scanner (System.in);

    @Override
    public void navegarInternet(){
        System.out.println("Digite sua pesquisa: ");
        String pesquisar = scan.next();
        System.out.println ("Navegando pela Internet, em busca de "+pesquisar); 
 }
}
