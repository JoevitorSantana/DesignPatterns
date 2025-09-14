import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Order order = new Order("12345", 250.75);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select payment gateway (1 for Stripe, 2 for MercadoPago): ");
        int choice = scanner.nextInt();

        PaymentGatewayInterface paymentGateway;
        if (choice == 1)
            paymentGateway = new StripePaymentGateway();
        else
            paymentGateway = new MercadoPagoPaymentGateway();

        OrderProcessorService orderProcessor = new OrderProcessorService(paymentGateway);
        orderProcessor.process(order);

        scanner.close();
    }
}