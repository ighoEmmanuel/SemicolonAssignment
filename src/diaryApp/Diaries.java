package diaryApp;

import java.util.ArrayList;

public class Diaries {
    private ArrayList<Diary> diaries = new ArrayList<>();


    public void addDiary(String userName, String passWord) {
        Diary newDiary = new Diary(userName, passWord);
        diaries.add(newDiary);
    }


    public void delete(String username, String password) {
        Diary toDelete = findIdByUsername(username);
        if (toDelete != null) {
                toDelete.validatePassword(password);
                diaries.remove(toDelete);
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


    public boolean checkPassword(String password) {
        for (Diary diary : diaries) {
            diary.unlock(password);
            return true;
        }
        return false;
    }

    public void lock() {
        for (Diary diary : diaries) {
            diary.lock();
        }
    }

}
