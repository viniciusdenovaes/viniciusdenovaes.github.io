// Estrutura do tipo LIFO
interface Pilha<T> {

    boolean isEmpty();
    int size();
    void push(T e);
    T pop();
    T peek();

}
