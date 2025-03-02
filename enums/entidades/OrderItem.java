package enums.entidades;

public class OrderItem {
    private Integer quantity;
    private Double price;

    Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price = product.getPrice();
    }

    public Double subTotal(){
        return price * quantity;
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

    @Override
    public String toString() {
        return product.getName() + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity + ", Subtotal: $" + String.format("%.2f", subTotal());
    }
}
