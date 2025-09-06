package Observer.OrderIFood;

enum OrderStatus {
    PLACED(1),
    PREPARING(2),
    OUT_FOR_DELIVERY(3),
    DELIVERED(4);

    private final int statusCode;

    OrderStatus(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
} 

public class Order {
    public static void main(String[] args) {
        OrderSubject order = new OrderSubject();

        Customer customer = new Customer();
        Restaurant restaurant = new Restaurant();

        order.addObserver(customer);
        order.addObserver(restaurant);

        order.updateOrderStatus(OrderStatus.PLACED.getStatusCode());
        order.updateOrderStatus(OrderStatus.PREPARING.getStatusCode());
        order.updateOrderStatus(OrderStatus.OUT_FOR_DELIVERY.getStatusCode());
        order.updateOrderStatus(OrderStatus.DELIVERED.getStatusCode());
    }
}
