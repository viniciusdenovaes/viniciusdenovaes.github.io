import java.lang.Iterable;

interface Bag<T> extends Iterable<T>{
    void add(T e);
}