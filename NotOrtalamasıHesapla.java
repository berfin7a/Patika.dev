package java101;
import java.util.Scanner;

public class notortalamasıödev {

    public static void main(String[] args){

        int mat, fizik, kimya, turkçe, tarih, muzik ;
        Scanner inp = new Scanner(System.in);
        System.out.println( "Matematik notnuz : ");
        mat = inp.nextInt();
        System.out.println("Fizik notunuz : ");
        fizik = inp.nextInt();
        System.out.println("Kimya notunuz : ");
        kimya = inp.nextInt();
        System.out.println("Türkçe notunuz : ");
        turkçe= inp.nextInt();
        System.out.println("Tarih notunuz : ");
        tarih= inp.nextInt();
        System.out.println("Müzik notunuz : ");
        muzik = inp.nextInt();

        double sonuç=  (mat+ fizik+ kimya+ turkçe+ tarih+ muzik) / 6.0 ;
        System.out.println("ortalamanız : " + sonuç);


        String sonuç1= (sonuç>=60) ? "sınıfı geçtiniz " : "sınıfta kaldınız";
        System.out.println(sonuç1);

  }
}
