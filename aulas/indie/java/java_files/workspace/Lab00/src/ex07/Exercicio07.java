package ex07;

public class Exercicio07 {
    
    public static void main(String[] args) {
        System.out.println(fatorial(0));
        System.out.println(fatorial(1));
        System.out.println(fatorial(2));
        System.out.println(fatorial(3));
        System.out.println(fatorial(4));
        System.out.println(fatorial(10));
    }
    
    
    
    public static int fatorial(int n){
        int resultado = 1;
        for(int i=1; i<=n; i++){
            resultado = resultado*i;
        }
        return resultado;
    }
    
    /*Solucao alternativa*/
    public static int fatorialRecursivo(int n){
        if(n==0) return 1;
        return n*fatorial(n-1);
    }
    
}
