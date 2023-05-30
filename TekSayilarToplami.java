package java101;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TekSayilarToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n , total =0;

        do {
            System.out.println("sayı giriniz :");
            n = scan.nextInt();
            if(n%2==0 && n%4==0){
                total +=n ;

            }

        }while (n%2 == 0) ;

        System.out.println("toplam :" +total);
    }
}
