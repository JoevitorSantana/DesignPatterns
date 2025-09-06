package Observer.OrderIFood;
import java.util.ArrayList;
import java.util.List;

public class OrderSubject {
    private List<OrderObserver> observers = new ArrayList<>();
    private int orderStatus; // 1 - Placed, 2 - Preparing, 3 - Out for Delivery, 4 - Delivered

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void updateOrderStatus(int status) {
        this.orderStatus = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.notifyOrderUpdate(orderStatus);
        }
    }
}