public class PilhaListaLigada<T> implements Pilha<T> {

    private Node<T> topo = null;
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
        Node<T> antigoTopo = topo;
        topo = new Node<>(e);
        topo.next = antigoTopo;

        tamanho++;
    }

    @Override
    public T pop() {
        T elemento = topo.element;
        topo = topo.next;

        tamanho--;

        return elemento;
    }

    @Override
    public T peek() {
        return topo.element;
    }
}
