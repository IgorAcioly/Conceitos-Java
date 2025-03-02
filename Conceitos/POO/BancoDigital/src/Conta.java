package BancoDigital.src;

public class Conta implements Transacoes {


    protected static final int AGENCIA = 1;
    protected static int CONTA = 1;
    protected int agencia = 1;
    protected int numeroConta = 1;
    protected Double saldo = 0.0;
    protected String nome;
    protected String tipoConta;

    public Conta (String nome, String tipoConta){
        this.nome = nome;
        this.agencia = AGENCIA;
        this.numeroConta = CONTA++;
        this.tipoConta = tipoConta;
    }

    public void sacar(Double saque) {
        saldo -= saque;
    }

    public void depositar(Double deposito) {
        this.saldo = saldo + deposito;
    }

    public void transferir(Double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }
    public String toString(){
        return "\n{Nome: "+nome+", Agência: "+agencia+", Número da Conta: "+numeroConta+", Conta: "+ tipoConta+", Saldo: "+saldo+"}\n";
}

    protected Double getSaldo() {
        return saldo;
    }

    protected void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    protected int getAgencia() {
        return agencia;
    }

    protected void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    protected int getNumeroConta() {
        return numeroConta;
    }

    protected void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }


    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return nome;
    }

}
