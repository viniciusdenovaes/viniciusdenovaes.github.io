package ex06;

public class Exercicio06 {
    
    public static void main(String[] args) {
        System.out.println(modulo(1));
        System.out.println(modulo(0));
        System.out.println(modulo(-1));
        System.out.println(modulo(2));
        System.out.println(modulo(-2));
    }
    
    public static int modulo(int n){
        if(n>=0){
            return n;
        } else{
            return -n;
        }
    }
    
}
