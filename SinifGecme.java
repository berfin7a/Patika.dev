package java101;
import java.util.Scanner ;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fizik, turkce, kimya, muzik;
        double toplam =0, average, derssayisi =5;

        System.out.println("matematik notunuzu giriniz  : ");
        mat = input.nextInt();
        System.out.println("fizik notunuzu girniz :");
        fizik = input.nextInt();
        System.out.println("turkce notunuzu giriniz  : ");
        turkce = input.nextInt();
        System.out.println("kimya notunuzu giriniz  : ");
        kimya = input.nextInt();
        System.out.println("muzik notunuzu giriniz  : ");
        muzik = input.nextInt();

        if (mat <= 100 && mat >= 0){
        toplam += mat;

        }else{
            System.out.println("notunuz 0 ile 100 arasında olmalıdır");
            mat=0;
            --derssayisi;
        }
        if (fizik<= 100 && fizik >= 0){
            toplam += fizik;
            
        }else{
            System.out.println("notunuz 0 ile 100 arasında olmalıdır");
            fizik=0;
            --derssayisi;
        }

        if (turkce <= 100 && turkce >= 0){
            toplam += turkce;
           
        }else{
            System.out.println("notunuz 0 ile 100 arasında olmalıdır");
            turkce=0;
            --derssayisi;
        }

        if (kimya <= 100 && kimya >= 0){
            toplam += kimya;
            
        }else{
            System.out.println("notunuz 0 ile 100 arasında olmalıdır");
            kimya=0;
            --derssayisi;
        }

        if (muzik <= 100 && muzik >= 0){
            toplam += muzik;
           
        }else{
            System.out.println("notunuz 0 ile 100 arasında olmalıdır");
            muzik=0;
            --derssayisi;
        }

        average = toplam/derssayisi ;


        if(average < 55) {
            System.out.println("sınıfı geçemediniz ");
        }else{
            System.out.println("sınıfı geçtiniz ");
        }
        System.out.println("ortalamanız :" + average);




    }
}
