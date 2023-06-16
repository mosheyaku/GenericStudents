import java.util.ArrayList;
import java.util.Iterator;

/*A generic class named SortedGroup used to define a collection of sorted members
in ascending order of some type T that implements the Comparable<T> interface.*/
public class SortedGroup<T extends Comparable<T>> implements Iterable<T> {

    private ArrayList<T> collection;

    /*A constructor that initializes the collection*/
    public SortedGroup() {
        collection = new ArrayList<>();
    }

    /*The add method accepts an element and adds it to the collection in
    its appropriate place so that the sorting is preserved.
    It is possible that the collection will include duplicate members.*/
    public void add(T element) {
        int index = 0;
        while (index < collection.size() && element.compareTo(collection.get(index)) > 0) {
            index++;
        }
        collection.add(index, element);
    }

    /*The remove method accepts a member and removes from the collection all
    the members that are equal (according to equals) to the given member.
    The method will return a number indicating how many members were removed.*/
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

    /*The iterator method returns an iterator of the generic type.*/
    @Override
    public Iterator<T> iterator() {
        return collection.iterator();
    }
}
