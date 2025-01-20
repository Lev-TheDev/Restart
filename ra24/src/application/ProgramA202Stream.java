package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product126;

public class ProgramA202Stream {

	public static void main(String[] args) {
		// /home/rogerlevino/Documentos/in.txt
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Product126> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product126(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			double avg = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x,y) -> x + y) / list.size();
			// ou reference method
			// double avg = list.stream().map(p -> p.getPrice()).reduce(0.0, Double::sum);
			System.out.println("Average price: " + String.format("%.2f", avg));
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
			// padrão forEach = System.out é a CLASSE e println é o MÉTODO
			
			// exemplo reduce com String
			List<String> words = Arrays.asList("how", " to", " use", " reduce", " to", " join", " string");
			String result = words
					.stream()
					.reduce("", (partialString , element) -> partialString + element);
			// ou utilizar reference method
			//String result = words.stream().reduce("", String::concat);
			System.out.println(result);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
