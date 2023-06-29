package java101;

import java.util.Scanner;

public class RecursivePower {
    static int power(int a, int b){
        int result =1;
        for (int i = 1;i<=b;i++){
            result *= a;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("taban sayısı :");
        int a = input.nextInt();
        System.out.println("üs değeri :");
        int b = input.nextInt();

        System.out.println("sonuç : " + power(a,b));
    }
}
