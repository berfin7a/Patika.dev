package java101;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kaç sayı gireceksiniz ? :");
        int n = input.nextInt();
        int min = 0, max = 0, sayi;



        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". sayıyı giriniz :");
             sayi = input.nextInt();
            if (sayi < min || min == 0) {
                min = sayi;
            }
            if (sayi > max) {
                max = sayi;
            }


        }
        System.out.println("min :" + min);
        System.out.println("max :" + max);


    }
}
