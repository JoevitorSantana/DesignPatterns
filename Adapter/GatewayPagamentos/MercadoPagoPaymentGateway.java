public class MercadoPagoPaymentGateway implements PaymentGatewayInterface {
    public void pay(Order order) {
        System.out.println("Processing payment of $" + order.getAmount() + " for order ID: " + order.getOrderId() + " via MercadoPago.");
        // Here would be the actual MercadoPago payment processing logic
    }
}
