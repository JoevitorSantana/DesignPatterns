public class Client {
    public static void main(String args[]) 
    {
        Order order = new Order();
        order.prepare();
        order.deliver();
        order.complete();
    }
}
