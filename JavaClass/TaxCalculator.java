import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] citizen = {"John", "Alice", "Bob"};
        double[]  earn = new double[citizen.length];

        for (int i = 0; i < citizen.length; i++) {
            System.out.print("Enter earnings for " + citizen[i] + ": ");
            earn[i] = scanner.nextDouble();
        }

        for (int i = 0; i < citizen.length; i++) {
            double tax = calculateTax(earn[i]);
            System.out.println(citizen[i] + "'s total tax: $" + String.format("%.2f", tax));
        }

        scanner.close();
    }

    public static double calculateTax(double earn) {
        double taxRate = (earn <= 30000) ? 0.15 : 0.20;
        double taxableAmount = (earn <= 30000) ? earn : 30000 + (earn - 30000) * 0.20;
        return taxableAmount * taxRate;
    }
}