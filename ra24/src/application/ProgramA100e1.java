package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Worker;

public class ProgramA100e1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		List<Worker> lista = new ArrayList<Worker>();
		
		for (int i=0; i<n; i++) {
			System.out.println("\nEmployee #" + (i+1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
				while (hasId(lista, id)) {
					System.out.println("--------------------------------");
					System.out.print("   Id already taken! Try again: ");
					System.out.println("\n--------------------------------");
					System.out.print("Id: ");
					id = sc.nextInt();
					sc.nextLine();
				}
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			Worker w = new Worker(id, name, salary);
			lista.add(w);
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int increasingN = sc.nextInt();
		/*for (Worker w : lista) {
			if (w.getId() == increasingN) {
				System.out.print("Enter the porcentage: ");
				double percentage = sc.nextDouble();
				w.increaseSalary(percentage);
			}
		}*/
		Worker exist = lista.stream().filter(x -> x.getId() == increasingN).findFirst().orElse(null);
		if (exist == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the porcentage: ");
			double percentage = sc.nextDouble();
			exist.increaseSalary(percentage);
		}
		
		System.out.println("\nList of employees:");
		for (Worker w : lista) {
			System.out.println(w);
		}

		sc.close();
	}
	
	public static boolean hasId(List<Worker> lista, int id) {
		Worker w = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return w != null;
	}

}
