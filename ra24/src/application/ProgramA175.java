package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class ProgramA175 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		String path = "/home/rogerlevino/Documentos/in175.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String csv = br.readLine();
			while (csv != null) {
				String[] fields = csv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				csv = br.readLine();
			}
			Collections.sort(list);
			for (Employee e : list) {
				System.out.println(e.getName() + ", " + String.format("%.2f", e.getSalary()));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
