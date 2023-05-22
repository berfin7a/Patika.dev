package java101;
import java.util.Scanner;

public class HavacSicakligi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sicaklik;

        System.out.println("hava sıcaklığı : ");
        sicaklik = inp.nextInt();

       if( sicaklik <5 ){
           System.out.println("kayak yapılabilir");

       }else if (sicaklik >= 5 && sicaklik < 15){
           System.out.println("sinemaya gidebilrsiniz");

       }else if (sicaklik <=15 && sicaklik <25){
           System.out.println("piknik yapılabilir");

       }else{
           System.out.println("yüzmeye gidebilirsiniz ");
       }
    }
}
