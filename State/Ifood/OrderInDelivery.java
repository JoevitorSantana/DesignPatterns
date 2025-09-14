public class OrderInDelivery implements OrderState
{

    public void prepare(Order order) {
        System.out.println("Order is already prepared and out for delivery.");
    }

    public void deliver(Order order) {
        System.out.println("Order is out for delivery.");
    }

    public void complete(Order order) {
        System.out.println("Order has been delivered and is now complete.");
        order.setState(new OrderCompleted());
    }
    
}
