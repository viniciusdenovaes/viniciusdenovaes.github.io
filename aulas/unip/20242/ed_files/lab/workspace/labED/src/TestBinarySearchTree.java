public class TestBinarySearchTree {

    public static void main(String[] args) {
        Conjunto<Integer> conjunto = new BinarySearchTree<>();

        conjunto.add(10);
        conjunto.add(13);
        conjunto.add(12);
        conjunto.add(3);
        conjunto.add(2);
        conjunto.add(5);
        conjunto.add(0);
        conjunto.add(15);
        conjunto.add(10);
        conjunto.add(1);
        conjunto.add(7);
        conjunto.add(11);
        conjunto.add(11);
        conjunto.add(11);
        conjunto.add(17);

        for(var e: conjunto){
            System.out.println(e);
        }

    }
    
}
