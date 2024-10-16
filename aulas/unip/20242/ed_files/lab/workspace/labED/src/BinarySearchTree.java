import java.util.Iterator;

public class BinarySearchTree<T extends Comparable<T>> implements Conjunto<T>{

    TreeNode<T> root = null;
    int tamanho = 0;

    @Override
    public boolean isEmpty() {
        return tamanho==0;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public void add(T e) {
        if(root==null){
            root = new TreeNode<>(e);
        }
        add(root, e);
    }

    private void add(TreeNode<T> subRoot, T e){
        int cmp = e.compareTo(subRoot.element);
        if(cmp==0) return;
        if(cmp>0){
            if(subRoot.right==null){
                subRoot.right = new TreeNode<>(e);
                tamanho++;
            }else{
                add(subRoot.right, e);
            }
        }
        if(cmp<0){
            if(subRoot.left==null){
                subRoot.left = new TreeNode<>(e);
                tamanho++;
            }else{
                add(subRoot.left, e);
            }
        }
    }

    @Override
    public boolean contains(T e) {
        return contains(root, e);
    }

    private boolean contains(TreeNode<T> subRoot, T e){
        if(subRoot == null) return false;
        int cmp = e.compareTo(subRoot.element);
        if(cmp==0) return true;
        else if(cmp>0) return contains(subRoot.right, e);
        else return contains(subRoot.left, e);
    }

    @Override
    public Iterator<T> iterator() {
        return new BinarySearchTreeIterator();
    }

    class BinarySearchTreeIterator implements Iterator<T>{

        Pilha<TreeNode<T>> proximos = new PilhaListaLigada<>();

        BinarySearchTreeIterator(){
            pushSubRoot(root);
        }

        @Override
        public boolean hasNext() {
            return !proximos.isEmpty();
        }

        private void pushSubRoot(TreeNode<T> subRoot){
            proximos.push(subRoot);
            if(subRoot.left!=null){
                pushSubRoot(subRoot.left);
            }
        }

        @Override
        public T next() {
            TreeNode<T> proximo = proximos.pop();
            if(proximo.right!=null){
                pushSubRoot(proximo.right);
            }
            return proximo.element;
        }
    }
}
