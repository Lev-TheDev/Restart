package entities;

public class Product126 implements Comparable<Product126> {
	private String name;
	private Double price;
	
	public Product126() {
	}

	public Product126(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " = " + String.format("%.2f", price);
	}

	@Override
	public int compareTo(Product126 o) {
		return price.compareTo(o.getPrice());
	}
	
	
}
