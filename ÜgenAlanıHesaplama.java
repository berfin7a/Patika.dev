package java101;
import java.sql.SQLOutput;
import java.util.Scanner ;

public class hipotenüsBulma {
    public static void main(String[]args) {
        double kenar1, kenar2 , kenar3, cevre, u, alan ;
        Scanner inp = new Scanner(System.in);
        System.out.println(" lütfen 1. kenar uzunluğunu giriniz :");
        kenar1 = inp.nextDouble();

        System.out.println("lütfen 2. kenar uzunluğunu giriniz :");
        kenar2 = inp.nextDouble();
        System.out.println("lütfen 3. kenar uzunluğunu giriniz :");
        kenar3 = inp.nextDouble();

        cevre = kenar1 + kenar2 + kenar3 ;
        u = cevre/2 ;
        alan =Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3)) ;


        System.out.println("üçgenin alanı :"+ alan);
        


    }

}
