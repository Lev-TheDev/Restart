package entities;

import java.util.HashSet;
import java.util.Set;

public class Banco {

    private Set<ContaCorrente> contasCorrentes;

    private Set<ContaPoupanca> contasPoupancas;

    private Long codigo;

    private String nome;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco() {
        this.contasCorrentes = new HashSet<>();
        this.contasPoupancas = new HashSet<>();
    }

    public void add(ContaCorrente cc) {
        this.contasCorrentes.add(cc);
    }

    public void add(ContaPoupanca cp) {
        this.contasPoupancas.add(cp);
    }

    public String falencia() {
        contasPoupancas.clear();
        contasCorrentes.clear();
        nome = null;
        codigo = null;
        return "O banco faliu!";
    }

    @Override
    public String toString() {
        return "Banco com as seguintes contas: [" +
                "contasCorrentes=" + contasCorrentes +
                ", contasPoupancas=" + contasPoupancas +
                ']';
    }
}
