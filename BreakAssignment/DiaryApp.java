import java.util.Scanner;
import java.util.HashMap;

public class DiaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> diaryEntries = new HashMap<>();
        HashMap<String, String> passWord = new HashMap<>();
        int choice;

        do {
            System.out.println();
            System.out.println("Welcome to StoneCode Diary app\nWhere your secret is 100% safe!!");
            System.out.println("1. Create Diary");
            System.out.println("2. Lock Diary");
            System.out.println("3. Unlock Diary");
            System.out.println("4. Add Entry");
            System.out.println("5. Find Entry by ID");
            System.out.println("6. Update Entry");
            System.out.println("7. Delete Entry");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("What would you like to name your diary (ID): ");
                    String input = scanner.nextLine();
                    System.out.println("Enter your secret: ");
                    String secret = scanner.nextLine();
                    diaryEntries.put(input, secret);
                    System.out.println("Diary Created!!!");
                    break;

                case 2:
                    System.out.println("Enter diary (ID) name: ");
                    String id = scanner.nextLine();
                    if (diaryEntries.containsKey(id)) {
                        System.out.println("Enter password: ");
                        String passCode = scanner.nextLine();
                        System.out.println("Diary locked with password.");
                        passWord.put(id, passCode);
                    } else {
                        System.out.println("ID not found.");
                    }
                    break;

                case 3:
                    System.out.println("Enter diary (ID) name: ");
                    String unLock = scanner.nextLine();
                    if (diaryEntries.containsKey(unLock)) {
                        System.out.println("Enter your password: ");
                        String password = scanner.nextLine();
                        if (passWord.containsKey(unLock) && passWord.get(unLock).equals(password)) {
                            System.out.println("Diary unlocked! Here is your secret:");
                            System.out.println(diaryEntries.get(unLock));
                        } else {
                            System.out.println("Incorrect password. Cannot unlock the diary.");
                        }
                    } else {
                        System.out.println("ID not found.");
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
