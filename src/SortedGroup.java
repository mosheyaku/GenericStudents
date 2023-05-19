import java.util.ArrayList;

public class SortedGroup <T extends Comparable<T>>{

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




}
