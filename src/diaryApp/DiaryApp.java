package diaryApp;

import javax.swing.*;
import java.util.Scanner;

public class DiaryApp {
    private static Scanner scanner = new Scanner(System.in);
    static Diaries diaries = new Diaries();



    public static void main(String[] args) {
        main();
    }
    public static void main() {
        String choice  = input("""
                Welcome to EmmaStoneCode Diary App
                
                Here are what we can do :
                
                1. Create Diary
                2. Log In
                3. Delete Diary
                4. Check Diaries
                5. Exit Program
                
                
                        Select From 1-5""");
        switch (choice) {
            case "1" -> createDiary();
            case "2" -> logIn();
            case "3" -> Delete();
        }

    }

    private static void Delete() {
        String userName = input("Enter user name: ");
        if(diaries.findIdByUsername(userName) == null) {
            throw new IllegalArgumentException("Invalid user name");
        }
        String password = input("Enter password: ");
        if(!diaries.checkPassword(password)) {
            throw new IllegalArgumentException("incorrect password");
        }

        diaries.delete(userName,password);
    }

    private static void logIn() {
        try {
            String userName = input("Enter user name: ");
            if (diaries.findIdByUsername(userName) == null) {
                throw new IllegalArgumentException("Invalid user name");
            }
            String password = input("Enter password: ");
            if (!diaries.checkPassword(password)) {
                throw new IllegalArgumentException("incorrect password");
            }
            String choice = input("""
                    1. Create Entry
                    2. Update Entry
                    3. Delete Entry
                    4. Check Entry
                    5. Lock Diary
                    6. Unlock Diary
                    7. Exit Program""");
            switch (choice) {
                case "1" -> createEntry();
                //case "2" -> updateEntry();
                //case "3" -> deleteEntry();
                //case "4" -> checkEntry();
                case "5" -> lockDairy();
                //case "6" -> unlockDiary();
            }

        }catch(IllegalArgumentException e) {
            prompt(e.getMessage());
        }
    }

    private static void lockDairy() {
        diaries.lock();
        prompt("Diary has been locked.");
    }

    private static void createEntry() {
        //if(diary.isLocked()){

        //}
    }

    public static void createDiary() {
        try {
            String userName = input("Enter user name: ");
            String password = input("Enter password: ");
            diaries.addDiary(userName, password);
            prompt("Diary created");
        }catch(IllegalArgumentException e) {
            prompt(e.getMessage());
        }finally {
            main();
        }
    }


    public static String input(String message){
        return JOptionPane.showInputDialog(message);
    }

    public static void prompt(String message){
        JOptionPane.showMessageDialog(null,message);
    }



}
