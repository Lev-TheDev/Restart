package application;

import entities.Banco;
import entities.ContaCorrente;
import entities.ContaPoupanca;


public class ProgramBanco {

    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.setCodigo(10L);
        banco.setNome("Banco Roger");

        ContaCorrente cc = new ContaCorrente(banco, 10d);
        ContaPoupanca cp = new ContaPoupanca(banco, 10d);

        banco.add(cc);
        banco.add(cp);

        System.out.println(banco);

        System.out.println(banco.falencia());
        banco = null;

        System.out.println(banco);

    }
}
