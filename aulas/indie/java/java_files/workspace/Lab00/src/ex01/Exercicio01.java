package ex01;

public class Exercicio01 {
    
    public static void main(String[] args) {
        System.out.println(calculaEstoqueMedio(0, 0));
        System.out.println(calculaEstoqueMedio(1, 1));
        System.out.println(calculaEstoqueMedio(1, 2));
        System.out.println(calculaEstoqueMedio(2, 9));
        System.out.println(calculaEstoqueMedio(101, 102));
    }
    
    public static double calculaEstoqueMedio(double estoqueMinimo, double estoqueMaximo){
        double estoqueMedio = (estoqueMinimo + estoqueMaximo)/2;
        return estoqueMedio;
    }
    
}
