public class StripePaymentGateway implements PaymentGatewayInterface {
    public void pay(Order order) {
        System.out.println("Processing payment of $" + order.getAmount() + " for order ID: " + order.getOrderId() + " via Stripe.");
        // Here would be the actual Stripe payment processing logic
    }
}
