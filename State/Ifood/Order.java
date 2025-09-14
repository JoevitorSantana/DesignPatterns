public class Order
{
    private OrderState state;

    public Order()
    {
        this.state = new OrderCreated();
    }

    public void setState(OrderState state)
    {
        this.state = state;
    }

    public void prepare()
    {
        state.prepare(this);
    }

    public void deliver()
    {
        state.deliver(this);
    }

    public void complete()
    {
        state.complete(this);
    }
}