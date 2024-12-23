import java.util.Scanner;
import java.util.HashMap;

public class DairyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> diaryEntries = new HashMap<>();
        int choice;

        do {
            System.out.println();
            System.out.println("Welcome to StoneCode Diary app\nWhere your secret is 100% safe!!");
            System.out.println("1. Create Diary");
            System.out.println("2. Lock Diary ");
            System.out.println("3. Unlock Diary");
            System.out.println("4. Add Entry");
            System.out.println("5. Find Entry by ID");
            System.out.println("6. Update Entry");
            System.out.println("7. Delete Entry");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline character

            switch (choice) {
                case 1:
                    System.out.println("What would you like to name your diary (ID): ");
                    String input = scanner.nextLine();
                    System.out.println("Like to add a password? (yes/no): ");
                    String answer = scanner.nextLine();
                    String password = "";

                    while (answer.equalsIgnoreCase("yes")) {
                        System.out.println("Create your password: ");
                        password = scanner.nextLine();
                        System.out.println("Confirm your password: ");
                        String passwordTwo = scanner.nextLine();

                        if (passwordTwo.equals(password)) {
                            break;
                        } else {
                            System.out.println("Passwords do not match. Try again.");
                        }
                    }

                    System.out.println("Would you like to enter your secret now? (yes/no): ");
                    String option = scanner.nextLine();
                    String secret = "";

                    if (option.equalsIgnoreCase("yes")) {
                        System.out.println("Enter your secret: ");
                        secret = scanner.nextLine();
                        diaryEntries.put(input, secret);
                    }

                    System.out.println("Diary Created!!!");
                    break;

                case 2:
                    System.out.println("Enter diary (ID) name: ");
                    String id = scanner.nextLine();
                    String keys = null;

                            for (diaryEntries.Entry<String, String> entry : diaryEntries.entrySet()) {
            if (id.equalsIgnoreCase(entry.getKey())) {
                        System.out.println("Enter password: ");
                        String passCode = scanner.nextLine();
                        System.out.println("Diary locked with password.");
                return;
                    }else {

                        System.out.println("ID not found.");
 
                    }
}
                    break;

                case 8:
                    System.out.println("Goodbye! Thanks for using Emma StoneCode Diary App!!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);

       
    }
}
