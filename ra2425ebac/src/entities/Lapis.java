package entities;

import interfaces.ICaneta;

public class Lapis implements ICaneta {
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor " + texto + " na classe " + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Cinza";
    }

    @Override
    public void comumATodas() {
        System.out.println("Impressão diferente do default!");
    }
}
