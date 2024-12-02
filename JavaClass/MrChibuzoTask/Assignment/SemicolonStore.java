import java.util.Scanner;

public class SemicolonStore {

    public static void main(String[] args) {
        printItems();
    }

    public static String nameOfUser() {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the customer's Name?");
        return s.nextLine();
    }

    public static String customerDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What did the customer buy? ");
        return scanner.nextLine();
    }

    public static int numberOfPieces() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many pieces? ");
        return scanner.nextInt();
    }

    public static double perUnit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much per unit? ");
        return scanner.nextDouble();
    }

    public static double total(int pieces, double unitPrice) {
        return pieces * unitPrice;
    }
    public static StringBuilder options() {
        Scanner s = new Scanner(System.in);
        StringBuilder items = new StringBuilder();
        String option;

        do {
            String customerItem = customerDetails();
            int pieces = numberOfPieces();
            double unitPrice = perUnit();
            double totalPrice = total(pieces, unitPrice);

            items.append(String.format("\t\t%-20s\t%-10d\t%-10.2f\t%-10.2f\n", customerItem, pieces, unitPrice, totalPrice));

            System.out.print("Add more Items? (yes/no): ");
            option = s.next();
        } while (option.equalsIgnoreCase("yes"));

        return items;
    }


    public static void printItems() {
        Scanner scanner = new Scanner(System.in);

        String customerName = nameOfUser();
        StringBuilder allItems = new StringBuilder();
        allItems.append("\n\t\tITEM\t\tQTY\t\tPRICE\t\t\tTOTAL(NGN)\n");
        allItems.append("----------------------------------------------------------------\n");

        allItems.append(options());

        System.out.println(allItems.toString());
    }
}
