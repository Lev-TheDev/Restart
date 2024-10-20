package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class ProgramA91e2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		People[] vect = new People[n];
		
		double sumH = 0.0;
		for(int i=0; i<vect.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			sc.nextLine();
			double height = sc.nextDouble();
			vect[i] = new People(name, age, height);
			sumH += vect[i].getHeight();
		}
		double avg = sumH / vect.length;
		System.out.printf("Altura média: %.2f%n", avg);
		
		double med = 0.0;
		for(int i=0; i<vect.length; i++) {
			if (vect[i].getAge() < 16) {
				med += 1;
			}
		}
		double medT = med * 100 / vect.length;
		
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", medT) + "%");
		for(int i=0; i<vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}
}
