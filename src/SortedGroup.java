import java.util.ArrayList;
import java.util.Iterator;

public class SortedGroup <T extends Comparable<T>> implements Iterable<T>{

    private ArrayList<T> collection;

    public SortedGroup(){
        collection= new ArrayList<>();
    }

    public void add(T element) {
        int index = 0;
        while (index < collection.size() && element.compareTo(collection.get(index)) > 0) {
            index++;
        }
        collection.add(index, element);
    }

    public int remove(T element) {
        int count = 0;
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(element)) {
                iterator.remove();
                count++;
            }
        }
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return collection.iterator();
    }
}
