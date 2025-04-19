package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramA161 {

	public static void main(String[] args) throws ParseException {
		// "/home/rogerlevino/Documentos/in.txt"
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		System.out.println(sourceFolderStr);
		boolean success = new File(sourceFolderStr + "/out").mkdir();
		System.out.println("Folder created: " + success);
		
		String targetFileStr = sourceFolderStr + "/out/summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			String itemCsv = br.readLine();
			while (itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				list.add(new Product(name,price,quantity));
				
				itemCsv = br.readLine();
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				for (Product p : list) {
					bw.write(p.getName() + ", " + String.format("%.2f", p.totalValueInStock()));
					bw.newLine();
				}
				System.out.println(targetFileStr + " created!");
			}
			catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		}
		catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
		
		sc.close();
	}

}
