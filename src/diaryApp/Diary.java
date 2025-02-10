package diaryApp;

import javax.swing.*;
import java.util.ArrayList;

public class Diary {
    private Entry entry;
    private boolean isLocked = true;
    private String username;
    private String password;
    private ArrayList<Entry> entries = new ArrayList<>();


    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public int getId(){
        return entries.size() + 1;
    }

    public void unlock(String password) {
        if(validatePassword(password)) {
            isLocked = false;
        }else{
            throw new IllegalArgumentException("Password does not match");
        }
    }

    public void lock(){
        isLocked = true;
    }

    public void createEntry(String title, String body) {
        if(!isLocked()){
            int  id = getId();
            Entry newEntry = new Entry(id, title, body);
            entries.add(newEntry);
            JOptionPane.showMessageDialog(null,"New entry created\nYour Entry Id :" + id);
        }else{
            throw new IllegalArgumentException("Diary is locked unlock first");
        }
    }

    public Entry findEntry(int id) {
        if (isLocked()) {
            throw new IllegalArgumentException("Unlock diary first!!");
        }else{
                for(Entry entry : entries) {
                    if(entry.getId() == id) {
                        return entry;
                    }
                }
            throw new IllegalArgumentException("id not found");
        }
    }


    public void delete(int id) {
        if(isLocked){
            System.out.println("Unlock diary first!!");
        }
        Entry toRemove = null;
        for(Entry entry : entries) {
            if(entry.getId() == id) {
                toRemove = entry;

            }
        }
        if(toRemove != null) {
            entries.remove(toRemove);
        }
    }


    public void update(int id,String title, String body) {
        if(isLocked()){
            throw new IllegalArgumentException("Unlock diary first!!");
        }
        Entry toUpdate = findEntry(id);
        if(toUpdate != null) {
            toUpdate.setTitle(title);
            toUpdate.setContent(body);
        }

    }

    public boolean validatePassword(String password) {
        if(password.equals(this.password)) {
            return true;
        }
        return false;
    }
    public String viewEntries() {
        if (entries.isEmpty()) {
            return "No entries available.";
        }

        StringBuilder result = new StringBuilder("Your Entries:\n");
        for (Entry entry : entries) {
            result.append("Entry ID: ").append(entry.getId()).append("\n")
                    .append("Title: ").append(entry.getTitle()).append("\n")
                    .append("Content: ").append(entry.getContent()).append("\n")
                    .append("-------------------\n");
        }
        return result.toString();
    }

}

