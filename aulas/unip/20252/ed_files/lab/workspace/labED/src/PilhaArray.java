public class PilhaArray<T> implements Pilha<T> {

    int tamanho = 0;
    T[] elementos = (T[]) new Object[1];

    @Override
    public boolean isEmpty() {
        return tamanho==0;
    }

    @Override
    public int size() {
        return tamanho;
    }

    private void resize(int cap){
        T[] outros = (T[]) new Object[cap];
        for(int i=0; i<tamanho; i++){
            outros[i] = elementos[i];
        }
        elementos = outros;
    }

    @Override
    public void push(T e) {
        if(tamanho==elementos.length){
            resize(2*tamanho);
        }
        elementos[tamanho] = e;
        tamanho++;
    }

    @Override
    public T pop() {
        if(tamanho<elementos.length/4){
            resize(elementos.length/2 + 1);
        }
        tamanho--;
        return elementos[tamanho];
    }

    @Override
    public T peek() {
        return elementos[tamanho-1];
    }
}
