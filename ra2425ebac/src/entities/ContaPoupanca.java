package entities;

public class ContaPoupanca {

    private Double saldo;

    private Banco banco;

    public ContaPoupanca(Banco banco, double saldo) {
        this.banco = banco;
        this.saldo = saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
