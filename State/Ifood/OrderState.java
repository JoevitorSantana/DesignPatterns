public interface OrderState
{
    public void prepare(Order order);
    public void deliver(Order order);
    public void complete(Order order);
}