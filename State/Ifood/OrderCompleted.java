public class OrderCompleted implements OrderState
{
    public void complete(Order order) {
        System.out.println("Order is already completed.");
        
    }

    public void deliver(Order order) {
        System.out.println("Order is already completed and cannot be delivered again.");
        
    }

    public void prepare(Order order) {
        System.out.println("Order is already completed and cannot be prepared again.");
    }
}
