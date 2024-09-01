public class FilaListaLigada<T> implements Pilha<T> {

    private Node<T> primeiro = null;
    private Node<T> ultimo = null;
    int tamanho=0;

    @Override
    public boolean isEmpty() {
        return tamanho==0;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public void push(T e) {
        Node<T> antigoUltimo = ultimo;
        ultimo = new Node<>(e);
        ultimo.next = null;

        if(primeiro==null) primeiro = ultimo;
        else               antigoUltimo.next = ultimo;

        tamanho++;
    }

    @Override
    public T pop() {
        T elemento = primeiro.element;
        primeiro = primeiro.next;
        if(primeiro==null) ultimo = null;

        tamanho--;

        return elemento;
    }

    @Override
    public T peek() {
        return primeiro.element;
    }
}
