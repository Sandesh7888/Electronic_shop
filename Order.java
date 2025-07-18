package Project_Java;

public class Order {
    private User user;
    private TV tv;
    private int quantity;

    public Order(User user, TV tv, int quantity) {
        this.user = user;
        this.tv = tv;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public TV getTv() {
        return tv;
    }

    public int getQuantity() {
        return quantity;
    }
}

