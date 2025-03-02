package enums.entidades;

import enums.OrderStatus;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.List;

public class Order {
    private LocalDateTime moment;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private OrderStatus status;

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    private List<OrderItem> items = new ArrayList<OrderItem>();

    private Client client;

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double Total() {
        Double total = 0.0;
        for (OrderItem item: items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void printSummary() {
        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: " + moment.format(formatter));
        System.out.println("Order status: " + status);
        System.out.println("Client: " + client);
        System.out.println("Order items:");
        for (OrderItem item: items) {
            System.out.println(item);
        }
        System.out.printf("Total Price: $%.2f", Total());
    }
}
