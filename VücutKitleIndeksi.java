
import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double kilo, boy ,kitleindeksi;
        System.out.println("boyunuz:");
        boy = inp.nextDouble();
        System.out.println("kilonuz:");
        kilo = inp.nextDouble();

        kitleindeksi = kilo/ (boy*boy) ;
        System.out.println("vücut kitle indeksiniz: "+kitleindeksi);




    }



}
