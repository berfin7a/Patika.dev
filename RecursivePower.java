package java101;

import java.util.Scanner;
public class RecursivePower{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(power(5,3));
    }
    static int power(int a, int b){
        int result =1;
        if (b == 0) {
            return result;
        }
        result *= a*power(a,--b);
        return result;
    }

}
