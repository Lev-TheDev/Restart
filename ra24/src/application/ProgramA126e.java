package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client126;
import entities.Order126;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product126;

public class ProgramA126e {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		System.out.println("Enter Client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client126 client = new Client126(name, email, birthDate);
		System.out.println();
		System.out.println("Enter order data:");
		//SpannableString textoNegrito = new SpannableString(); para deixar texto em negrito
		System.out.print("Status: ");
		String enumStr = sc.next();
		Order126 order = new Order126(new Date(), OrderStatus.valueOf(enumStr), client);
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1;i <= n;i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String pName = sc.nextLine();
			System.out.print("Product price: ");
			double pPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			Product126 prod = new Product126(pName, pPrice);
			OrderItem item = new OrderItem(quantity, pPrice, prod);
			order.addItems(item);
		}
		System.out.println("\nORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
	}

}
