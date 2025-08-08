import java.util.Iterator;

public class BagIterable<T> implements Bag<T>{

    Node<T> first = null;
    Node<T> last = null;

    public void add(T e){
        if(first==null){
            first = new Node<T>(e);
            last = first;
            return;
        }
        last.next = new Node<>(e);
        last = last.next;
    }

    public Iterator<T> iterator(){
        return new BagIterator();
    }

    class BagIterator implements Iterator<T>{
        Node<T> current = first;
        public boolean hasNext(){
            return current!=null;
        }
        public T next(){
            T e = current.element;
            current = current.next;
            return e;
        }
    }
}
