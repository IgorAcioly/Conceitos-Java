package BancoDigital.src;

public class main extends Banco{
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente cc = new ContaCorrente("Igor");
        ContaPoupanca cp = new ContaPoupanca("Guimas");
        banco.adicionarContaCorrente(cc);
        banco.adicionarContaPoupanca(cp);

        cc.depositar(100.0);
        cp.depositar(50.0);

        banco.exibirLista();

        banco.contaMaisValiosa();
        banco.contaMenosValiosa();


    }
}
