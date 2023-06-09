package java101;
import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz : ");
        int n = input.nextInt();
        int j;

        for(int i =1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }


    }



}
