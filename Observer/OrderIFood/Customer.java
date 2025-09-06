package Observer.OrderIFood;

public class Customer implements OrderObserver {
    public void notifyOrderUpdate(int status) {
        switch (status) {
            case 1:
                System.out.println("Customer: Your order has been placed.");
                break;
            case 2:
                System.out.println("Customer: Your order is being prepared.");
                break;
            case 3:
                System.out.println("Customer: Your order is out for delivery.");
                break;
            case 4:
                System.out.println("Customer: Your order has been delivered.");
                break;
            default:
                System.out.println("Customer: Unknown order status.");
                break;
        }
    }
}
