import diaryApp.Entry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestEntry{
    @Test
    public void testMyIdNumberReturnErrorMessageIfNegative(){
        assertThrows(IllegalArgumentException.class,() -> {
            Entry entry = new Entry(-1,"Emmanuel","a guy");},
                "id cannot be negative");
    }

    @Test
    public void testMyEntryReturnErrorIfTitleIsNull() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Entry(1, null, "a guy"),
                "Expected an IllegalArgumentException when title is null"
        );
    }


    @Test
    public void testMyEntryGetIdFunction(){
        Entry entry = new Entry(1,"Emmanuel","a guy","12/2/2020");
        assertEquals("Emmanuel",entry.getTitle());
    }
}