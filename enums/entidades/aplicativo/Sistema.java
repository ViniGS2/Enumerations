package enums.entidades.aplicativo;

import enums.OrderStatus;
import enums.entidades.Client;
import enums.entidades.Order;
import enums.entidades.OrderItem;
import enums.entidades.Product;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime moment = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.println("BirthDate: (dd/MM/yyyy)");
        String Clientbirth = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(Clientbirth, formato);
        Client client = new Client(name, email, birthDate);
        System.out.println("Enter Order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        OrderStatus oStatus = OrderStatus.valueOf(status);
        System.out.print("How many items to this order? ");
        int q = sc.nextInt();
        Order order = new Order(moment, oStatus, client);
        for(int i = 0; i < q; i++) {
            System.out.println("Enter item #" + (i + 1) + ": ");
            System.out.print("Product name: ");
            sc.nextLine();
            String nameP = sc.nextLine();
            System.out.print("Product price: ");
            double priceP = sc.nextDouble();
            System.out.print("Quantity: ");
            int qq = sc.nextInt();
            Product product = new Product(nameP, priceP);
            OrderItem orderItem = new OrderItem(qq, product);
            order.addItem(orderItem);

        }
        System.out.println("OrderSummary");
        order.printSummary();
    }
}
