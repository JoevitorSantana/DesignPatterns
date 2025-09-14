import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        TaxTypeInterface taxType;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount to calculate taxes on: ");
        double amount = scanner.nextDouble();

        System.out.println("Insert the type of Tax to be calculated:");
        String taxTypeInput = scanner.next();

        switch (taxTypeInput.toUpperCase()) {
            case "ICMS":
                taxType = new ICMS();
                break;
            case "IPI":
                taxType = new IPI();
                break;
            case "ISS":
                taxType = new ISS();
                break;
            default:
                System.out.println("Invalid tax type. Defaulting to ICMS.");
                taxType = new ICMS();
                break;
        }

        System.out.println("Calculating taxes for amount: " + amount);
        taxCalculator.setTaxType(taxType);
        System.out.println(taxTypeInput + ": " + taxCalculator.calculate(amount));

        scanner.close();
    }
}