import java.util.InputMismatchException;
import java.util.Scanner;

class UtilsInput{
    static public int getInt(){
        return getInt("");
    }
    static public int getInt(String msg){
        System.out.println(msg);
        Scanner in = new Scanner(System.in);
        try{
            return in.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Numero entrado nao eh um inteiro");
            System.out.println(e.getMessage());
            e.printStackTrace();
            throw(e);
        }
    }
}