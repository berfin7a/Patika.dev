package java101;
import java.util.Scanner;

public class CiftSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, toplam =0 , sayi =0 , ort;

        System.out.println("sayı giriniz : ");
        a = input.nextInt();

        for(int i = 1 ; i <= a ; i++){
            if( (i%3 == 0 ) && (i%4 ==0)){
                toplam +=i;
                sayi++;
                System.out.println(i);
                
            }
        }
        ort = toplam/sayi;
        System.out.println("toplam : " + toplam);
        System.out.println("ortalama : " + ort);




    }
}
