package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramA38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double min_ex;
		double vmin_ex;
		double min_base = 50.00;
		int min_used = sc.nextInt();
		
		if (min_used < 100) {
			System.out.printf("Valor a pagar: R$ %.2f", min_base);
		}
		else if (min_used > 100) {
			min_ex = min_used - 100;
			vmin_ex = min_ex * 2;
			System.out.printf("Valor a pagar: R$ %.2f", (vmin_ex + min_base));
			// min_base = min_base + ((min_used - 100) * 2);
			// ou min_base += (min_used - 100) * 2;
		}
		
		sc.close();
	}

}
