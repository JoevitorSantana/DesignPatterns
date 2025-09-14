public class OrderProcessorService {
    PaymentGatewayInterface paymentGateway;
    
    public OrderProcessorService(
        PaymentGatewayInterface paymentGateway
    ) {
        this.paymentGateway = paymentGateway;
    }

    public void process(Order order) {
        paymentGateway.pay(order);
    }
}
