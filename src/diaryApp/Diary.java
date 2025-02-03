package diaryApp;

import java.util.ArrayList;

public class Diary {

    private boolean value = true;
    private String username;
    private String password;
    private ArrayList<Entry> entries = new ArrayList<>();


    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isLocked() {
        return value;
    }

    public int getId(){
        return entries.size() + 1;
    }

    public void unlock(String password) {
        if(this.password.equals(password)) {
            value = false;
        }else{
            throw new IllegalArgumentException("Password does not match");
        }
    }

    public void createEntry(String title, String body, String date) {
        if(isLocked()){
            throw new IllegalArgumentException("Diary is locked " +
                    "Unlock first!!");
        }else{
            Entry newEntry = new Entry(getId(), title, body, date);
            entries.add(newEntry);
            System.out.println("New entry created");
        }
    }

    public void showEntries() {
        if (isLocked()) {
            throw new IllegalArgumentException("Unlock diary first!!");
        }
        for (Entry entry : entries) {
            System.out.println(entry.getId() + ": " + entry.getTitle() + " (" + entry.getDate() + ")");
        }
    }
}
