public class TestFilaListaLigada {

    public static void main(String[] args) {
        Pilha<Integer> p = new FilaListaLigada<>();

        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);

        System.out.println("tamanho: " + p.size());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.peek());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size() + " elemento: " + p.pop());
        System.out.println("tamanho: " + p.size());

    }

}
