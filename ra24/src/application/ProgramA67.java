package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramA67 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
	
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product p = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + p.toString());
		
		System.out.println();
		System.out.print("Enter the amount of products to be added in stock: ");
		int added = sc.nextInt();
		p.addProducts(added);
		
		System.out.println();
		System.out.println("Updated data: " + p.toString());
		
		System.out.println();
		System.out.print("Enter the amount of products to be removed from stock: ");
		int removed = sc.nextInt();
		p.removeProducts(removed);
		
		System.out.println();
		System.out.println("Updated data: " + p);
		
		sc.close();
	}
}
