public class Node<T> {
    public T element;
    public Node<T> next = null;
    public Node(){}
    public Node(T aElement){
        this();
        element = aElement;
    }
}
