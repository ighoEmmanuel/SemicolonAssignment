package diaryApp;

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
        if(isLocked()){
            throw new IllegalArgumentException("Diary is locked " +
                    "Unlock first!!");
        }else{
            Entry newEntry = new Entry(getId(), title, body);
            entries.add(newEntry);
            System.out.println("New entry created");
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
}

