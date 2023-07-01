package java101;
import java.util.Scanner;

public class RecursiveDesen {
    static int num(int n ){
        int sayi = n;
        System.out.println(n);
        if (n > 0) {
            int result = num(n - 5);
            if (sayi <=0 ){

                result = num(n+5);
                return result ;
            }

        }

        return sayi;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı girniz :");
        int n = scan.nextInt();
        System.out.println(num(n));
    }

}
