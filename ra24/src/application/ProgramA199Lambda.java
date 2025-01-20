package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

import entities.Product126;
import services.ProductService;

public class ProgramA199Lambda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product126> list = new ArrayList<>();
		
		list.add(new Product126("TV", 900.00));
		list.add(new Product126("Mouse", 50.00));
		list.add(new Product126("Tablet", 350.50));
		list.add(new Product126("HD", 80.90));
		
		ProductService ps = new ProductService();
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
		Function<Integer, Integer> func1 = x -> x + x;
		Integer result = func1.apply(10);
		System.out.println(result);
		
		
	}

}
