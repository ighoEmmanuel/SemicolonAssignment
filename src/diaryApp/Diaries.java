package diaryApp;

import java.util.ArrayList;

public class Diaries {
    private ArrayList<Diary> diaries = new ArrayList<>();
    private boolean isLocked = false;


    public void addDiary(String userName, String passWord) {
        Diary newDiary = new Diary(userName, passWord);
        diaries.add(newDiary);
    }


    public void delete(String username, String password) {
        Diary diary = findIdByUsername(username);
        if (diary != null && diary.validatePassword(password)) {
            diaries.remove(diary);
        }else{
            throw new IllegalArgumentException("Invalid username or password");
        }
    }


    public Diary findIdByUsername(String username) {
        for(Diary diary : diaries) {
            if(diary.getUsername().equals(username)) {
                return diary;
            }
        }
        return null;
    }


    public boolean checkPassword(String username, String password) {
        Diary diary = findIdByUsername(username);
        return diary != null && diary.validatePassword(password);
    }





}
