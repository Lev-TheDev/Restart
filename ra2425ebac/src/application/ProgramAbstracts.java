package application;

import abstracts.Assalariado;
import abstracts.Comissionado;
import abstracts.Empregado;
import abstracts.Horista;

public class ProgramAbstracts {

    public static void main(String args[]) {
        Assalariado emp = new Assalariado();
        emp.setSalario(100.0);
        Empregado empregado = emp;
        empregado.setNome("Jhonathan");
        imprimir(empregado);
        imprimir(emp);

        Horista hor = new Horista();
        hor.setHoraTrabalhada(2.0);
        hor.setPrecoHora(100.0);
        Empregado e = hor;
        e.setNome("Luiz");
        imprimir(hor);
        imprimir(e);

        Empregado empreg = new Comissionado();
        Comissionado comi = (Comissionado) empreg;
        comi.setTotalComissao(38.0);
        comi.setTotalVenda(49.0);
        comi.setNome("Mike");
        imprimir(comi);
        imprimir(empreg);

    }

    public static void imprimir(Empregado funcionario) {
        if (funcionario instanceof Horista) {
            Horista h = (Horista) funcionario;
            System.out.println("Preço da hora: " + h.getPrecoHora());
        }
        funcionario.imprimirValores();
        funcionario.imprimirSobrenome();
        System.out.println(funcionario.getNome() + " tem de salário: " + funcionario.vencimento() + "\n");
    }
}
