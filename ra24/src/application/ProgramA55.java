package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramA55 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char rep;
		double temp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			temp = sc.nextDouble();
			double Faren = (temp * 9) / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", Faren);
			System.out.print("Deseja repetir (s/n)? ");
			rep = sc.next().charAt(0);
		} while (rep != 'n');
		
		sc.close();
	}

}
