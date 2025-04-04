package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order126 {
	
	private Date moment;
	private OrderStatus status;
	private Client126 client;
	
	public List<OrderItem> items = new ArrayList<>();
	
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");

	public Order126(Date moment, OrderStatus status, Client126 client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client126 getClient() {
		return client;
	}

	public void setClient(Client126 client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItems(OrderItem item) {
		items.add(item);
	}
	public void removeItems(OrderItem item) {
		items.remove(item);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client);
		sb.append("Order items: ");
		double amount = 0;
		for (OrderItem i : items) {
			sb.append(i.toString() + "\n");
			amount += i.subTotal(i.getQuantity(), i.getPrice());
		}
		sb.append("Total price: $" + String.format("%.2f", amount));
		return sb.toString();
	}
	

}
