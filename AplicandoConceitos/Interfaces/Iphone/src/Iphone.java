import java.util.Scanner;
import musica.Reprodutor;
import navegador.Navegador;
import telefone.Discador;

public class Iphone implements Reprodutor,Navegador,Discador{

    Scanner scan = new Scanner (System.in);

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.menu();
        
     }

    private void menu () {
        int opcao=0;

        while (opcao!=4){
            selecao();
            opcao = scan.nextInt();
            switch (opcao) {
                case 1 : {
                    tocarMusica();
                    break;
                }
                case 2 : {
                    discarChamada();
                    break;
                }
                case 3 : {
                    navegarInternet();
                    break;
                }
                case 4 : {
                    break;
                }
                default : {
                    System.out.println("Informe uma opção válida! \n ");
                    break;
                }
            }
            }
        }

    // Implementando métodos das interfaces
    @Override 
    public void discarChamada(){
        System.out.println("\n Digite o número desejado: ");
        int discar = scan.nextInt();
        boolean ligar = true;
    System.out.println("Ligando para "+ discar+"\n Usando Telefone "+ligar);
    }
    @Override
    public void navegarInternet(){
        System.out.println("\n Digite sua pesquisa: ");
        String pesquisar = scan.next();
        System.out.println ("Navegando pela Internet, em busca de "+pesquisar); 
    }
    @Override
    public void tocarMusica() {
        System.out.println("\n Escolha sua música: ");
        String nomeMusica = scan.next();
        System.out.println("Tocando Música: "+ nomeMusica);
    }

        private void selecao (){
            System.out.println("\n Escolha através do menu: ");
            System.out.println("1 - Reprodutor de Múscia");
            System.out.println("2 - Telefone");
            System.out.println("3 - Navegador Internet");
            System.out.println("4 - Sair");
        } 
    }
    
    