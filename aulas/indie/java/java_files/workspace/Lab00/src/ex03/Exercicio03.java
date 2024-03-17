package ex03;

public class Exercicio03 {
    
    public static void main(String[] args) {
        System.out.println(conversorCelsiusToFahrenheit(0));
        System.out.println(conversorCelsiusToFahrenheit(1));
        System.out.println(conversorCelsiusToFahrenheit(2));
        System.out.println(conversorCelsiusToFahrenheit(20));
        System.out.println(conversorCelsiusToFahrenheit(39));
        System.out.println(conversorCelsiusToFahrenheit(40));
        System.out.println(conversorCelsiusToFahrenheit(100));
    }
    
    public static double conversorCelsiusToFahrenheit(double grauC){
        double grauF = (9*grauC+160)/5;
        return grauF;
    }
    
}
