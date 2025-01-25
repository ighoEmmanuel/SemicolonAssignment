public class MyQueue {
    private  String[] queue;
    private int capacity;
    public boolean value  = true;
    private int size = 0;


    public  MyQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new String[capacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size  == 0;
    }

    public boolean isNotEmpty() {
        return size > 0;
    }
    

    public int size() {
        return size;
    }

    public void addToQueue(String item) {
      if(size == capacity) {
          System.out.println("Queue is full");
      }else {
              queue[size] = item;
              size++;

      }
    }


    public void remove(String element) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (queue[i].equals(element)) {
                found = true;
                for (int j = i; j < size - 1; j++) {
                    queue[j] = queue[j + 1];
                }
                queue[size - 1] = null;
                size--;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }

}
