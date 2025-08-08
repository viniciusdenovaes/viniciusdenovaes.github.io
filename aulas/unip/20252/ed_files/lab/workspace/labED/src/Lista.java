interface Lista<T> extends Iterable<T>{

    boolean isEmpty();
    int size();

    T get(int i);
    void set(T e, int i);

    void pushPrimeiro(T e);
    void pushUltimo(T e);

    void delete(int i);

}
