import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyList {
    @Test
    public void TestMyListIfIsEmpty() {
        MyList myList = new MyList();
        assertTrue(myList.isEmpty());
    }
    @Test
    public void TestMyListIfIsNotEmpty() {
        MyList myList = new MyList();
        assertFalse(myList.isNotEmpty());
    }
    @Test
    public void TestMyListAdds() {
        MyList myList = new MyList();
        myList.add("Emmanuel");
        assertTrue(myList.isNotEmpty());
    }
    @Test
    public void TestMyListRemoves() {
        MyList myList = new MyList();
        myList.add("Emmanuel");
        myList.remove("Emmanuel");
        assertTrue(myList.isEmpty());
    }
    @Test
    public void TestMyListSize(){
        MyList myList = new MyList();
        myList.add("Emmanuel");
        assertEquals(1,myList.sizes());

        myList.remove("Emmanuel");
        assertEquals(0,myList.sizes());

        myList.add("Another");
        myList.add("Emmanuel");
        assertEquals(2,myList.sizes());
    }
    @Test
    public void AddXYZ_GetXIndex() {
        MyList myList = new MyList();
        myList.add("Emmanuel");
        myList.add("Another");
        myList.add("lase@");
        assertEquals("Emmanuel", myList.index(0));

    }
    @Test
    public void AddXYZ_RemoveX_ReturnIndexZero(){
        MyList myList = new MyList();
        myList.add("Emmanuel");
        myList.add("Another");
        myList.add("lase");
        myList.remove("Emmanuel");
        assertEquals("Another", myList.index(0));

        myList.add("igho");
        myList.add("okay");
        assertEquals("Another", myList.index(0));
        assertEquals("igho", myList.index(2));
        assertEquals("okay", myList.index(3));
        assertEquals("lase", myList.index(1));

    }
    @Test
    public void AddXYZW_GetCapacity(){
        MyList myList = new MyList();
        myList.add("Emmanuel");
        myList.add("Another");
        myList.add("lase@");
        myList.add("igho");
        assertEquals(6, myList.capacity());
    }
    @Test
    public void AddXYZ_ReturnTrueIfXContainsList(){
        MyList myList = new MyList();
        myList.add("Emmanuel");
        myList.add("Another");
        myList.add("lase@");
        assertTrue(myList.contains("Emmanuel"));
    }

    @Test
    public void AddXY_ClearReturnNull(){
        MyList myList = new MyList();
        myList.add("Emmanuel");
        myList.clear();
        assertTrue( myList.isEmpty());
        assertEquals(0, myList.sizes() );
    }

    @Test
    public void AddXYZ_ReplaceXWithKReturnK(){
        MyList myList = new MyList();
        myList.add("Emmanuel");
        myList.add("Another");
        myList.add("lase@");
        myList.replace(0,"jonathan");
        assertEquals("jonathan", myList.index(0));
    }

}
