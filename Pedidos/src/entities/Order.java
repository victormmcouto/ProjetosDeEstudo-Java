package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private LocalDateTime moment;
	private OrderStatus status;
	
	private Client client;
	List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}
	
	public Order(Client client, String status) {//, LocalDateTime moment) {
		this.status = OrderStatus.valueOf(status);
		this.moment = LocalDateTime.now();
		this.client = client;
	}
	
	public String getStatus() {
		return status.toString();
	}

	public void setStatus(String status) {
		this.status = OrderStatus.valueOf(status);
	}
	
	public LocalDateTime getMoment() {
		return moment;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double sum;
		sum = 0.0;
		for (OrderItem item: items) {
			sum += item.subTotal();
		}
		
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		
		sb.append("ORDER SUMARY \n");
		sb.append("Order moment: ");
		sb.append(formatterDateTime.format(getMoment()) + "\n");
		sb.append("Order status: ");
		sb.append(getStatus() + "\n");
		sb.append(client + "\n");
		sb.append("Order Items:\n");
		
		for (OrderItem item: items) {
			sb.append(item + "\n");
		}
		
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()) + "\n");
		
		return sb.toString();
	}
}	
