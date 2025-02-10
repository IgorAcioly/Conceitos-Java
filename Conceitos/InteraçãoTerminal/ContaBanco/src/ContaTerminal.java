import java.util.Scanner;

public class ContaTerminal {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o número da conta: ");
        int numeroConta = scan.nextInt();

        System.out.println ("Insira a Agência: ");
        String agenciaCliente = scan.next();

        System.out.println("Insira o nome do cliente: ");
        String nomeCliente = scan.next();

        System.out.println ("Insira seu saldo: ");
        Double saldoCliente = scan.nextDouble();

        System.out.println ("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agenciaCliente + ", conta: " + numeroConta + " e seu saldo: " + saldoCliente + " já está disponível para saque");

    }

}