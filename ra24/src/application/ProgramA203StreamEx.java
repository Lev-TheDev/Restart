package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee2;

public class ProgramA203StreamEx {

	public static void main(String[] args) {
		// /home/rogerlevino/Documentos/in203.txt
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Employee2> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee2(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			List<String> emails = list.stream()
					.filter(e -> e.getSalary() > 2000.00)
					.map(e -> e.getEmail())
					.sorted()
					.collect(Collectors.toList());
			System.out.println("Email of people whose salary is more than 2000.00:");
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
					
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}
