import diaryApp.Diary;
import diaryApp.Entry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    public void testIfMyDiaryIsUnlockedAndMyDiaryIsLocked() {
        Diary diary = new Diary("Emmanuel","jojo");
        diary.unlock("jojo");
        diary.createEntry("title","My guy");
        diary.lock();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testMyDiaryFindFunctionIsWorking(){
        Diary diary = new Diary("Emmanuel","jojo");
        diary.unlock("jojo");
        diary.createEntry("title","My guy");
        Entry input = diary.findEntry(1);
        assertEquals("title",input.getTitle());
    }

    @Test
    public void testMyDeleteFunctionIsWorking(){
        Diary diary = new Diary("Emmanuel","jojo");
        diary.unlock("jojo");
        diary.createEntry("title","My guy");
        diary.createEntry("oat","my man");
        diary.delete(1);
        assertThrows(IllegalArgumentException.class, ()->{diary.findEntry(1);},
                "Id not found");
    }

    @Test
    public void testMyDiaryCanUpdateEntry(){
        Diary diary = new Diary("Emmanuel","jojo");
        diary.unlock("jojo");
        diary.createEntry("title","My guy");
        diary.createEntry("oat","my man");
        diary.update(1,"emma","okay");
        assertEquals("emma",diary.findEntry(1).getTitle());
    }
}
