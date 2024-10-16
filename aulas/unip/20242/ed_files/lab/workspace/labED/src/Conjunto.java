import java.util.Iterator;

interface Conjunto<T extends Comparable<T>> extends Iterable<T> {

    boolean isEmpty();
    int size();
    void add(T e);
    boolean contains(T e);
    // void delete(T e);

}
