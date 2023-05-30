package java101;
import java.util.Scanner;
public class UsAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k,total=1;

        System.out.println("üstü alınacak sayı :");
        n= input.nextInt();
        System.out.println("üs olacak sayı : ");
        k = input.nextInt();

        for(int i =1; i<=k;i++){
            total *= n;
        }
        System.out.println("cevap :"+ total);
    }
}
