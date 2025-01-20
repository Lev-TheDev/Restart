package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product126;

public class ProductService {
	
	public double filteredSum(List<Product126> list, Predicate<Product126> criteria) {
		double sum = 0.0;
		for (Product126 p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
