package ex02;

public class Exercicio02 {
    
    public static void main(String[] args) {
        System.out.println(conversaoDolar(1, 1));
        System.out.println(conversaoDolar(0.5, 1));
        System.out.println(conversaoDolar(0.5, 2));
        System.out.println(conversaoDolar(2, 1));
        System.out.println(conversaoDolar(5.37, 1));
        System.out.println(conversaoDolar(5.37, 100));
        System.out.println(conversaoDolar(5.37, 0.5));
    }
    
    
    
    public static double conversaoDolar(double cotacaoDolar, double valorDolar){
        double valorReal = cotacaoDolar*valorDolar;
        return valorReal;
    }
    
}
