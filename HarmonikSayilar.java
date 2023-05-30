package java101;
import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n,total =0.0;

        System.out.println("bir sayı giriniz :");
        n = input.nextDouble();

        for(int i=1; i<=n;i++){
           total += (1.0/i);  //burda 1 girince int/int olduğuna dikkat et !!

        }
        System.out.println(total);



    }
}

