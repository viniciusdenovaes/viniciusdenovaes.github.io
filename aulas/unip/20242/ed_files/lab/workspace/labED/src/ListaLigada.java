import java.util.Iterator;

public class ListaLigada<T> implements Lista<T>{

    Node<T> primeiro = null;
    Node<T> ultimo = null;
    int tamanho = 0;

    @Override
    public boolean isEmpty() {
        return tamanho==0;
    }

    @Override
    public int size() {
        return tamanho;
    }

    private Node<T> getNode(int i){
        Node<T> result = primeiro;
        for(int j=0; j<i; j++){
            result = result.next;
        }
        return result;
    }

    @Override
    public T get(int i) {
        return getNode(i).element;
    }

    @Override
    public void set(T e, int i) {
        getNode(i).element = e;
    }

    @Override
    public void pushPrimeiro(T e) {
        Node<T> novo = new Node<>(e);
        if(isEmpty()){
            ultimo = novo;
        }else{
            novo.next = primeiro;
        }
        primeiro = novo;
        tamanho++;
    }

    @Override
    public void pushUltimo(T e) {
        Node<T> novo = new Node<>(e);
        if(isEmpty()){
            primeiro = novo;
        }else{
            ultimo.next = novo;
        }
        ultimo = novo;
        tamanho++;
    }

    @Override
    public void delete(int i) {
        if(i==0){
            primeiro = primeiro.next;
        }else{
            Node<T> iNode = getNode(i-1);
            iNode.next = iNode.next.next;
        }
        tamanho--;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListaLigadaIterator();
    }

    class ListaLigadaIterator implements Iterator<T>{

        Node<T> theNext = primeiro;

        @Override
        public boolean hasNext() {
            return theNext!=null;
        }

        @Override
        public T next() {
            T e = theNext.element;
            theNext = theNext.next;
            return e;
        }
    }
}
