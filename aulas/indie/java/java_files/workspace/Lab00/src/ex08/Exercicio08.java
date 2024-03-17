package ex08;

import ex07.Exercicio07;

public class Exercicio08 {
    
    public static void main(String[] args) {
        System.out.println(binomial(0, 0));
        System.out.println(binomial(1, 0));
        System.out.println(binomial(1, 1));
        System.out.println(binomial(2, 1));
        System.out.println(binomial(5, 1));
        System.out.println(binomial(2, 2));
        System.out.println(binomial(5, 2));
        System.out.println(binomial(10, 3));
    }
    
    public static int binomial(int n, int k){
        int nFat = Exercicio07.fatorial(n);
        int kFat = Exercicio07.fatorial(k);
        int resultado = nFat/(kFat*Exercicio07.fatorial(n-k));
        return resultado;
    }
    
}
