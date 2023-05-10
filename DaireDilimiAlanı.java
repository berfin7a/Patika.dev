package java101;
import java.util.Scanner;

public class DarieAlanı {
    public static void main(String[]args) {
        Scanner inp = new Scanner(System.in);
        double r, a, alan, pi=3.14 ;
        System.out.println("yarıçap uzunluğu : ");
        r = inp.nextDouble();
        System.out.println("merkez açısı :");
        a = inp.nextDouble();

        alan = pi*(r*r)*a/360;

        System.out.println("daire dilimi alanı = "+alan);




    }

}
