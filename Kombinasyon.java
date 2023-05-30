package java101;
import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //C(n,r) = n!/(r!*(n-r)!)
        int n,r,a,sonuc;
        int atotal=1,ntotal=1,rtotal =1;
        
        System.out.println("n değeri : ");
        n= scan.nextInt();
        System.out.println("r değeri : ");
        r = scan.nextInt();

        for(int i =1; i<=n; i++){
            ntotal = ntotal * i;
        }
        for(int i=1; i<=r; i++){
            rtotal = rtotal* i;

        }
        a = n-r;
        for(int i =1;i<=a; i++){
            atotal= atotal * i;

        }
        sonuc = ntotal / (rtotal*atotal);
        System.out.println(n + "'in " + r +" 'li kombinasyonu :"+ sonuc);



    }
}
