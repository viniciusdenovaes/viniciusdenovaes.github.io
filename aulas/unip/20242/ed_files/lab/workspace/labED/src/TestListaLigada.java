import java.util.Iterator;

public class TestListaLigada{

    public static void main(String[] args) {
        Lista<Integer> numeros = new ListaLigada<>();

        System.out.println("pushing 1 2 3 4");
        numeros.pushPrimeiro(1);
        numeros.pushPrimeiro(2);
        numeros.pushUltimo(3);
        numeros.pushUltimo(4);
        for(var e : numeros){
            System.out.println(e);
        }

        System.out.println("set 5 1");
        numeros.set(5, 1);
        for(var e : numeros){
            System.out.println(e);
        }

        System.out.println("delete 2");
        numeros.delete(2);
        for(var e : numeros){
            System.out.println(e);
        }

        System.out.println("Esvaziando");
        numeros.delete(0);
        numeros.delete(0);
        numeros.delete(0);
        for(var e : numeros){
            System.out.println(e);
        }

        System.out.println("pushing 0");
        numeros.pushPrimeiro(0);
        for(var e : numeros){
            System.out.println(e);
        }

    }

}
