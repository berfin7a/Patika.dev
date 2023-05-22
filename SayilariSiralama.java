package java101;
import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c ;

        System.out.println("1. sayıyı giriniz :" );
        a = inp.nextInt();
        System.out.println("2. sayıyı giriniz :" );
        b = inp.nextInt();
        System.out.println("3. sayıyı giriniz :" );
        c = inp.nextInt();

        if((a<b) && (a<c)){
            if(b<c){
                System.out.println("a < b < c");
            }else{
                System.out.println("a < c < b");
            }
        }else if ((b<c) && (b<a)){
            if(c<a){
                System.out.println("b < c < a");
            }else{
                System.out.println("b < a < c");
            }
        }else {
            if(a<b){
                System.out.println("c < a < b");
            }else{
                System.out.println("c < b < a");
            }
        }
    }
}
