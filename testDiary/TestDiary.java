import diaryApp.Diary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDiary {

    @Test
    public void testIfMyDiaryIsLocked() {
        Diary diary = new Diary("Emmanuel","jojo");
        assertTrue(diary.isLocked());
    }

    @Test
    public void testIfMyDiaryIsUnLocked() {
        Diary diary = new Diary("Emmanuel","jojo");
        diary.unlock("jojo");
        assertFalse(diary.isLocked());
    }


    @Test
    public void testMyDiaryCanAddEntry() {
        Diary diary = new Diary("Emmanuel","jojo");
        diary.unlock("jojo");
        diary.createEntry("title","My guy","23/05/2024");

    }
}
