public class ICMS implements TaxTypeInterface {
    public double calculate(double amount) {
        return amount * 0.05;
    }
}
