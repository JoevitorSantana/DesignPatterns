public class OrderCreated implements OrderState
{
    public void prepare(Order order)
    {
        System.out.println("Order is being prepared.");
        order.setState(new OrderInPrepare());
    }

    public void deliver(Order order)
    {
        System.out.println("Order cannot be delivered. It is not prepared yet.");
    }

    public void complete(Order order)
    {
        System.out.println("Order cannot be completed. It is not delivered yet.");
    }
}