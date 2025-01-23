import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMySet {
    @Test
    public void TestMySetIsEmpty() {
        MySet set = new MySet();
        assertTrue(set.isEmpty());
    }
    @Test
    public void TestMySetIsNotEmpty() {
        MySet set = new MySet();
        assertFalse(set.isNotEmpty());
    }
    @Test
    public void TestMySetAdds(){
        MySet set = new MySet();
        set.add("Igho");
        assertTrue(set.isNotEmpty());

    }
    @Test
    public void TestMySetSize(){
        MySet set = new MySet();
        set.add("Igho");
        assertEquals(1,set.size());
        set.add("Igho");
        assertEquals(1,set.size());
    }
    @Test
    public void TestMySetContains(){
        MySet set = new MySet();
        set.add("Igho");
        set.add("Emmanuel");
        assertTrue(set.contains("Emmanuel"));
    }

    @Test
    public void AddXYZ_RemoveAll(){
        MySet set = new MySet();
        set.add("igho");
        set.add("Emmanuel");
        set.add("Emmanuel");
        String[] myArray = {"Emmanuel","igho"};
        set.removeAll(myArray);
        assertEquals(0,set.size());
        set.remove("Emmanuel");
        assertEquals(0,set.size());
    }
}

