package diaryApp;

import javax.swing.*;
import java.util.Scanner;

public class DiaryApp {
    private static final Scanner  scanner = new Scanner(System.in);
    static Diaries diaries = new Diaries();
    static Diary diary;

    public static void main(String[] args) {
        showMainMenu();
    }

    public static void showMainMenu() {
            String choice = input("""
                    Welcome to EmmaStoneCode Diary App
                    
                    Here are what we can do :
                    
                    1. Create Diary
                    2. Log In
                    3. Delete Diary
                    4. Exit Program
                    
                    Select From 1-4""");
            switch (choice) {
                case "1" -> createDiary();
                case "2" -> logIn();
                case "3" -> deleteDiary();
                case "4" -> {
                    prompt("Thank you for using my program");
                    System.exit(0);
                }
            }

    }

    private static void deleteDiary() {
        try {
            String userName = input("Enter username: ");
            Diary foundDiary = diaries.findIdByUsername(userName);
            if (foundDiary == null) throw new IllegalArgumentException("Invalid username");

            String password = input("Enter password: ");
            if (!foundDiary.validatePassword(password)) throw new IllegalArgumentException("Incorrect password");

            diaries.delete(userName, password);
            prompt("Diary deleted successfully.");
        } catch (IllegalArgumentException e) {
            prompt(e.getMessage());
        }finally {
            showMainMenu();
        }
    }

    public static void logIn() {
        try {
            String userName = input("Enter username: ");
            Diary foundDiary = diaries.findIdByUsername(userName);
            if (foundDiary == null) throw new IllegalArgumentException("Invalid username");

            String password = input("Enter password: ");
            if (!foundDiary.validatePassword(password)) throw new IllegalArgumentException("Incorrect password");

            diary = foundDiary;
            logInOptions();
        } catch (IllegalArgumentException e) {
            prompt(e.getMessage());
        }finally {
            showMainMenu();
        }
    }

    private static void logInOptions() {

            String choice = input("""
                    1. Create Entry
                    2. Update Entry
                    3. Delete Entry
                    4. Lock Diary
                    5. Unlock Diary
                    6. View Entries
                    7. Log Out""");
            switch (choice) {
                case "1" -> createEntry();
                case "2" -> updateEntry();
                case "3" -> deleteEntry();
                case "4" -> lockDiary();
                case "5" -> unlockDiary();
                case "6" -> viewEntries();
                case "7" -> showMainMenu();
                default -> {
                    prompt("Invalid option. Choose between 1-6.");
                    logInOptions();
                }
            }

    }

    private static void viewEntries() {
        try{
        prompt(diary.viewEntries());
    }finally {
        logInOptions();
        }

    }

    private static void unlockDiary() {
        try {
            String password = input("Enter password: ");
            diary.unlock(password);
            prompt("Diary unlocked successfully.");
        } catch (IllegalArgumentException e) {
            prompt(e.getMessage());
        }finally {
            logInOptions();
        }
    }

    private static void deleteEntry() {
        try {
            int entryId = Integer.parseInt(input("Enter entry ID: "));
            diary.delete(entryId);
            prompt("Entry deleted successfully.");
        } catch (IllegalArgumentException e) {
            prompt(e.getMessage());
        }finally {
            logInOptions();
        }
    }

    private static void updateEntry() {
        try {
            int entryId = Integer.parseInt(input("Enter entry ID: "));
            String title = input("Enter new title: ");
            String content = input("Enter new content: ");
            diary.update(entryId, title, content);
            prompt("Entry updated successfully.");
        } catch (IllegalArgumentException e) {
            prompt(e.getMessage());
        }finally {
            logInOptions();
        }
    }

    private static void lockDiary() {
        diary.lock();
        prompt("Diary locked successfully.");
    }

    public static void createEntry() {
        try {
            String title = input("Enter title: ");
            String content = input("Enter content: ");
            diary.createEntry(title, content);
        } catch (IllegalArgumentException e) {
            prompt(e.getMessage());
        }finally{
            logInOptions();
        }
    }

    public static void createDiary() {
        try {
            String userName = input("Enter username: ");
            String password = input("Enter password: ");
            diaries.addDiary(userName, password);
            prompt("Diary created successfully.");
        } catch (IllegalArgumentException e) {
            prompt(e.getMessage());
        }finally{
            showMainMenu();
        }
    }

    public static String input(String message) {
        return JOptionPane.showInputDialog(message);
    }

    public static void prompt(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
