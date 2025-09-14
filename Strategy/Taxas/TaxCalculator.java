public class TaxCalculator {
    private TaxTypeInterface taxType;

    public double calculate(double amount) {
        return taxType.calculate(amount);
    }

    public void setTaxType(TaxTypeInterface taxType) {
        this.taxType = taxType;
    }
}
