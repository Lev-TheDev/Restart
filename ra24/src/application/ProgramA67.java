package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramA67 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		Product p = new Product();
		
		System.out.print("Name: ");
		p.name = sc.nextLine();
		System.out.print("Price: ");
		p.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		p.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + p.toString() + ", Total: $ " + p.totalValueInStock());
		
		System.out.println();
		System.out.print("Enter the amount of products to be added in stock: ");
		int added = sc.nextInt();
		p.addProducts(added);
		
		System.out.println();
		System.out.println("Updated data: " + p.toString() + ", Total: $ " + p.totalValueInStock());
		
		System.out.println();
		System.out.print("Enter the amount of products to be removed from stock: ");
		int removed = sc.nextInt();
		p.removeProducts(removed);
		
		System.out.println();
		System.out.println("Updated data: " + p);
		
		sc.close();
	}
}
