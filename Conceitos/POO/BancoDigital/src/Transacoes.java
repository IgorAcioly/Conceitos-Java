package BancoDigital.src;

public interface Transacoes{

    void sacar(Double saque);
    void depositar(Double deposito);
    void transferir(Double transferencia, Conta destino);
}
