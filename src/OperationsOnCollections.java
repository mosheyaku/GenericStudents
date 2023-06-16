import java.util.Iterator;

/*A class that implements the reduce method.*/
public class OperationsOnCollections {

    /*A generic method called reduce that receives a sorted collection (of the SortedGroup type)
    and a single member x of the same type as the members of the sGroup collection.
    The method produces a new collection of the SortedGroup type that contains all
    the members from the sGroup collection that are actually greater than the x member.
    The method will return the new collection.
    The operation is performed without destroying the original sGroup collection.*/
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
