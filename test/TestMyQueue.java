import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestMyQueue {

    @Test
    public void TestMyQueueIsEmpty() {
        MyQueue myQueue = new MyQueue(5);
        assertTrue(myQueue.isEmpty());
    }

    @Test
    public void TestMyQueueIsNotEmpty() {
        MyQueue myQueue = new MyQueue(5);
        assertFalse(myQueue.isNotEmpty());
    }

    @Test
    public void TestMyQueueSIZE(){
        MyQueue myQueue = new MyQueue(5);
        assertEquals(0,myQueue.size());
    }

    @Test
    public void TestMyQueueAddFunctionAndReturnSize(){
        MyQueue myQueue = new MyQueue(5);
        myQueue.addToQueue("Hello");
        myQueue.addToQueue("World");
        assertEquals(2,myQueue.size());

    }

    @Test
    public void TestMyQueueRemoveFunctionAndReturnSize() {
        MyQueue myQueue = new MyQueue(5);
        myQueue.addToQueue("Hello");
        myQueue.addToQueue("okay");
        myQueue.remove("okay");
        assertEquals(1,myQueue.size());

    }


}
