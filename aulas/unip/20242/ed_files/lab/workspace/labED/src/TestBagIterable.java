public class TestBagIterable {

    public static void main(String[] args) {
        Bag<Integer> bag = new BagIterable<>();

        bag.add(1);
        bag.add(2);
        bag.add(3);
        bag.add(4);

        for(var i: bag){
            System.out.println(i);
        }

    }
    
}
