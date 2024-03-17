package ex04;

public class Exercicio04 {
    
    public static void main(String[] args) {
        System.out.println(conversorFahrenheitToCelsius(0));
        System.out.println(conversorFahrenheitToCelsius(1));
        System.out.println(conversorFahrenheitToCelsius(2));
        System.out.println(conversorFahrenheitToCelsius(20));
        System.out.println(conversorFahrenheitToCelsius(32));
        System.out.println(conversorFahrenheitToCelsius(40));
        System.out.println(conversorFahrenheitToCelsius(100));
    }
    
    public static double conversorFahrenheitToCelsius(double grauF){
        double grauC = (grauF-32)*5/9;
        return grauC;
    }
    
}
