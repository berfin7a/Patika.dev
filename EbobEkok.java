package java101;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz :");
        int n1 = input.nextInt();
        System.out.println("n2 sayısını giriniz :");
        int n2 = input.nextInt();
        int i=1 , ebob=1 ,ekok =1;

        while(i<=n1){
            if(n1%i==0 && n2%i==0){
                ebob =i;
                System.out.println(i);
            }
            i++;

        }
        System.out.println("ebob : " + ebob);

        ekok = (n1*n2)/ebob;
        System.out.println("ekok :" +ekok);


    }
}
