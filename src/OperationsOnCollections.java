import java.util.Iterator;

public class OperationsOnCollections {

    public static <T extends Comparable<T>> SortedGroup<T> reduce(SortedGroup<T> sGroup, T x) {
        SortedGroup<T> result = new SortedGroup<>();

        Iterator<T> iterator = sGroup.iterator();
        while (iterator.hasNext()) {
            T collection = iterator.next();
            if (collection.compareTo(x) > 0) {
                result.add(collection);
            }
        }

        return result;
    }
}
