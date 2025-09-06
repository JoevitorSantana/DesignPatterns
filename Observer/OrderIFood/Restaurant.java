package Observer.OrderIFood;

public class Restaurant implements OrderObserver {
    public void notifyOrderUpdate(int status) {
        switch (status) {
            case 1:
                System.out.println("Restaurant: New order received.");
                break;
            case 2:
                System.out.println("Restaurant: Order is being prepared.");
                break;
            case 3:
                System.out.println("Restaurant: Order is out for delivery.");
                break;
            case 4:
                System.out.println("Restaurant: Order has been delivered.");
                break;
            default:
                System.out.println("Restaurant: Unknown order status.");
                break;
        }
    }
}
