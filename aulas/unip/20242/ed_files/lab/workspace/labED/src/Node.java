public class Node<T> {
    T element;
    Node<T> next = null;
    public Node(){}
    public Node(T aElement){
        this();
        element = aElement;
    }
}
