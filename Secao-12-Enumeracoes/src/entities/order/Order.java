package entities.order;

import entities.client.Client;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date moment;
	private OrderStatus status;
	private Client client;

	private final List<OrderItem> orderItem = new ArrayList<>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void addItem (OrderItem item){
		orderItem.add(item);
	}

	public void removeItem (OrderItem item){
		orderItem.remove(item);
	}

	public Double total (){
		double total = 0;
		for (OrderItem items: orderItem){
			total += items.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ORDER SUMMARY:\n");
		builder.append("Order moment: ").append(sdf.format(moment));
		builder.append("\nOrder status: ").append(status);
		builder.append("\nClient: ").append(client.getName())
				.append(" (").append(sdf.format(client.getBirthDate())).append(") - ")
				.append(client.getEmail());

		builder.append("\nOrder items:");
		for (OrderItem item : orderItem){
			builder.append("\n");
			builder.append(item.getProduct().getName());
			builder.append(", $").append(String.format("%.2f", item.getProduct().getPrice()));
			builder.append(", Quantity: ").append(item.getQuantity());
			builder.append(", Subtotal: $").append(String.format("%.2f", item.subTotal()));
		}
		builder.append("\nTotal price: $").append(String.format("%.2f", total()));

		return builder.toString();
	}
}
