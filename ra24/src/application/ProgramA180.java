package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product126;
import services.CalculationService;


public class ProgramA180 {

	public static void main(String[] args) {
		List<Product126> list = new ArrayList<>();
		String path = "/home/rogerlevino/Documentos/in180.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product126(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			Product126 x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 

	}

}
