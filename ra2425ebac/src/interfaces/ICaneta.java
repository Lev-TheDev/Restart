package interfaces;

public interface ICaneta {
    public void escrever(String texto);

    public String getCor();

    default void comumATodas(){
        System.out.println("Impressão default!\n");
    }
}
