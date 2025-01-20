package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	public Product126 product = new Product126();
	
	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price, Product126 prod) {
		this.quantity = quantity;
		this.price = price;
		this.product = prod;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product126 getProduct() {
		return product;
	}

	public void setProduct(Product126 product) {
		this.product = product;
	}
	
	public Double subTotal(int quantity, double price) {
		return quantity * price;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName() + ", $");
		sb.append(product.getPrice() + ", ");
		sb.append("Quantity: " + this.quantity);
		sb.append("Subtotal: $" + subTotal(quantity, price));
		return sb.toString();
	}
}
