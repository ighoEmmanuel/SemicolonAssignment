public class MyList {
    private boolean answer = true;
    private int size = 0;
    private String[] elements = new String[3] ;

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isNotEmpty() {
        return size > 0;
    }

    public void add(String elements) {
        if(size == this.elements.length) {
            isFull();
        }
        this.elements[size] = elements;
        size++;
    }
    public int findElements(String elements) {
        for(int i = 0; i < this.elements.length; i++) {
            if(elements.equals(this.elements[i])) return i;
        }
        return -1;
    }


    public void remove(String element) {
        int index = findElements(element);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size--;
        }
    }

    public void isFull(){
        String[] newElement = new String[elements.length * 2];
        for(int i = 0; i < size; i++) {
            newElement[i] = elements[i];
        }
        elements = newElement;
    }


    public int sizes() {
        return size;
    }

    public String index(int i) {
        return elements[i];
    }

    public int capacity() {
        return elements.length;
    }

    public boolean contains(String input) {
      for(String element : elements) {
          if(input.equals(element)) return true;
      }
        return false;
    }

    public void replace(int index, String input) {
        elements[index] = input;
    }


    public void clear() {
        String[] newElement = new String[3];
        size = 0;
    }


}
