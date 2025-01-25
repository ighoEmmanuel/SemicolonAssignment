public class MySet {
    private int size = 0;
    private MyList list = new MyList();


    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isNotEmpty() {
        return size > 0;

    }

    public void add(String element) {
        if (!list.contains(element)) {
            list.add(element);
            size++;
        }
    }

    public int size() {
        return this.size = size;
    }

    public boolean contains(String element) {
        return list.contains(element);
    }

    public void removeAll(String[] itemsToRemove) {
        for (String item : itemsToRemove) {
            if (list.contains(item)) {
                remove(item);
                size--;
            }else{
                System.out.println("this "+item+" is not in the list");
            }
        }
    }

    public void addAll(String[] itemsToAdd) {
        for (String item : itemsToAdd) {
            if (!list.contains(item)) {
                list.add(item);
                size++;
            }
        }
    }
    public void remove(String element) {
        list.remove(element);
    }

}
