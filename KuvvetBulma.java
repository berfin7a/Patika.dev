package java101;
import java.util.Scanner;

public interface KuvvetBulanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.println("sayı giriniz :");
        n = scan.nextInt();

        System.out.println("girilen sayıya kadar 4'ün kuvvetleri :  ");

        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);


            }
        System.out.println("girilen sayıya kadar 5'in kuvvetleri : ");
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);


        }


    }
}
