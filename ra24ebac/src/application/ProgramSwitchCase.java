package application;

import java.util.Scanner;

public class ProgramSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int idade = sc.nextInt();

        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);

        sc.close();
    }

    public static String getIdade(int idade) {
        String result;
        switch (idade) {
            case 0:
            case 5:
                result = "Você é um bebê";
                break;
            case 6:
            case 10:
                result = "criança";
                break;
            case 11:
            case 18:
                result = "adolescente";
                break;
            default:
                result = "adulto";
                break;
        }
        return result;
    }
}