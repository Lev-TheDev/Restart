package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramA25 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		/*String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		double w;
		w = sc.nextDouble();
		System.out.printf("Você digitou: %.2f\n", w);
		Locale.setDefault(Locale.US);
		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou: " + z);
		char q;
		q = sc.next().charAt(0);
		System.out.println("Você digitou: " + q);
		*/
		String n;
		int b;
		double v;
		n = sc.next();
		b = sc.nextInt();
		v = sc.nextDouble();
		System.out.println("Você digitou: ");
		System.out.println(n);
		System.out.println(b);
		System.out.println(v);
		
		
		
		sc.close();
	}

}
