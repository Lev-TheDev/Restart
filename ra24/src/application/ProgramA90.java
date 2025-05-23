package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductV;

public class ProgramA90 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductV[] vect = new ProductV[n];
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductV(name, price);
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.printf("Average price = %.2f", avg);
		
		sc.close();
	}

}
