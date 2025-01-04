package application;

import entities.CanetaEsferografica;
import entities.Giz;
import entities.Lapis;
import interfaces.ICaneta;

public class ProgramInterfaces {
    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá, Mundo da Caneta!");
        System.out.println(caneta.getCor());
        caneta.comumATodas();

        ICaneta giz = new Giz();
        giz.escrever("Olá, Mundo do Giz!");
        System.out.println(giz.getCor());
        giz.comumATodas();

        ICaneta lapis = new Lapis();
        lapis.escrever("Olá, Mundo do Lapis!");
        System.out.println(lapis.getCor());
        lapis.comumATodas();

    }
}