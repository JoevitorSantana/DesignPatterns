public class OrderInPrepare implements OrderState
{
    public void prepare(Order order)
    {
        System.out.println("Order is already being prepared.");
    }

    public void deliver(Order order)
    {
        System.out.println("Order is being delivered.");
        order.setState(new OrderInDeliver());
    }

    public void complete(Order order)
    {
        System.out.println("Order cannot be completed. It is not delivered yet.");
    }
}