package ex05;

public class Exercicio05 {
    
    public static void main(String[] args) {
        System.out.println(calculaVolumeLata(1, 1));
        System.out.println(calculaVolumeLata(2, 1));
        System.out.println(calculaVolumeLata(1, 2));
        System.out.println(calculaVolumeLata(1, 1/Math.PI));
        System.out.println(calculaVolumeLata(2, 1/Math.PI));
        System.out.println(calculaVolumeLata(10, 1));
        System.out.println(calculaVolumeLata(1, 10));
        System.out.println(calculaVolumeLata(10, 10));
    }
    
    public static double calculaVolumeLata(double raio, double altura){
        /*V = 3.14159*R²*A*/
        double volume = Math.PI*Math.pow(raio, 2)*altura;
        return volume;
    }
    
}
