import java.util.Scanner;
import java.util.HashMap;

public class DiaryApp {

    public static Scanner scanner = new Scanner(System.in);
    public static HashMap<String, String> diaryEntries = new HashMap<>();
    public static HashMap<String, String> passwords = new HashMap<>();

    public static void main(String[] args) {
        int choice;
        do {
            displayMenu();
            choice = Integer.parseInt(scanner.nextLine());
            handleChoice(choice);
        } while (choice != 8);
    }

    public static void displayMenu() {
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
    }

    public static void handleChoice(int choice) {
        switch (choice) {
            case 1 :
                createDiary();
                break;
            case 2 :
                lockDiary();
                break;
            case 3 :
                unlockDiary();
                break;
            case 4 :
                addEntry();
                break;
            case 5 :
                findEntryById();
                break;
            case 6 :
                updateEntry();
                break;
            case 7 :
                deleteEntry();
                break;
            case 8 :
                System.out.println("Goodbye! Thanks for using Emma StoneCode Diary App!!");
                break;
            default :
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    public static void createDiary() {
        System.out.print("What would you like to name your diary (ID): ");
        String id = scanner.nextLine();
        System.out.print("Enter your secret: ");
        String secret = scanner.nextLine();
        diaryEntries.put(id, secret);
        System.out.println("Diary Created!!!");
    }

    public static void lockDiary() {
        System.out.print("Enter diary (ID) name: ");
        String id = scanner.nextLine();
        if (passwords.containsKey(id)) {
            System.out.println("Password has already been created!");
        } else if (diaryEntries.containsKey(id)) {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            passwords.put(id, password);
            System.out.println("Diary locked with password.");
        } else {
            System.out.println("ID not found.");
        }
    }

     public  static void unlockDiary() {
        System.out.print("Enter diary (ID) name: ");
        String id = scanner.nextLine();
        if (!diaryEntries.containsKey(id)) {
            System.out.println("ID not found.");
            return;
        }
        if (passwords.containsKey(id)) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            if (passwords.get(id).equals(password)) {
                System.out.println("Diary unlocked!");
                displayDiaryContent(id);
            } else {
                System.out.println("Incorrect password. Cannot unlock the diary.");
            }
        } else {
            System.out.println("This diary is not locked.");
            displayDiaryContent(id);
        }
    }

    public static void displayDiaryContent(String id) {
        System.out.print("Should your secret be displayed (yes/no)? ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println(diaryEntries.get(id));
        }
    }

    public static void addEntry() {
        System.out.print("Enter the diary (ID) where you want to add an entry: ");
        String id = scanner.nextLine();
        if (!diaryEntries.containsKey(id)) {
            System.out.println("Diary ID not found.");
            return;
        }
        if (passwords.containsKey(id)) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            if (!passwords.get(id).equals(password)) {
                System.out.println("Incorrect password. Cannot add entry.");
                return;
            }
        }
        System.out.print("Enter your new entry: ");
        String newEntry = scanner.nextLine();
        String existingEntry = diaryEntries.get(id);
       String  entry =  existingEntry + "\n" + newEntry;
        diaryEntries.put(id, entry);
        System.out.println("Entry added successfully!");
    }

    public static void findEntryById() {
        System.out.print("Enter diary (ID) name: ");
        String id = scanner.nextLine();
        if (!diaryEntries.containsKey(id)) {
            System.out.println("ID not found.");
        }
        if (passwords.containsKey(id)) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            if (passwords.get(id).equals(password)) {
                System.out.println(diaryEntries.get(id));
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println(diaryEntries.get(id));
        }
    }

    public static void updateEntry() {
        System.out.print("Enter the diary (ID) you want to update: ");
        String id = scanner.nextLine();

        if (!diaryEntries.containsKey(id)) {
            System.out.println("Diary ID not found.");
        }

        if (passwords.containsKey(id)) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            if (!passwords.get(id).equals(password)) {
                System.out.println("Incorrect password. Cannot update entry.");
            }
        }

        System.out.println("Do you want to:");
        System.out.println("1. Replace the entire entry");
        System.out.println("2. Append new content to the existing entry");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            System.out.print("Enter the new content for this diary: ");
            String newContent = scanner.nextLine();
            diaryEntries.put(id, newContent);
            System.out.println("Diary entry replaced successfully!");
        } else if (choice == 2) {
            System.out.print("Enter the content to append: ");
            String additionalContent = scanner.nextLine();
            String updatedContent = diaryEntries.get(id);
            String update  = updatedContent + "\n" + additionalContent;
            diaryEntries.put(id, update);
            System.out.println("update successful!");
        } else {
            System.out.println("Invalid choice. Update canceled.");
        }

    }

    public static void deleteEntry() {
        System.out.println("Enter diary (ID) name:");
        String diary  = scanner.nextLine();
        if (diaryEntries.containsKey(diary)) {
            if (passwords.containsKey(diary)) {
                System.out.print("Enter your password: ");
                String password = scanner.nextLine();
                if(passwords.get(diary).equals(password)) {
                    passwords.remove(diary);
                }else{
                    System.out.println("Incorrect password. Cannot delete entry.");
                }
            } else {
                diaryEntries.remove(diary);
            }
        }else {
            System.out.println("Diary ID not found.");
        }
            System.out.println("Diary deleted successfully!");
        }
    }

