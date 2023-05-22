package java101;
import java.util.Scanner;

public class UcakBileti {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double mesafe, normal, toplam, yasindirimi, yonindirimi;
        int yas, yon;

        System.out.println("mesafe bilgisi giriniz :");
        mesafe = input.nextDouble();

        System.out.println("yaşınız :");
        yas = input.nextInt();

        System.out.println("1-tek yön / 2-çift yön");
        yon = input.nextInt();
        
        normal = mesafe * 0.10;
        

        if(yas>0 && mesafe>0 && (yon ==1 || yon==2)){
            if (yas < 12) {
                yasindirimi = normal * 0.5;

            } else if (yas >= 12 && yas < 24) {
                yasindirimi = normal * 0.1;

            } else if (yas > 65) {
                yasindirimi = normal * 0.3;

            } else {
                yasindirimi = 0;
            }
            System.out.println("yas indiirimi : " + yasindirimi);
            toplam = normal - yasindirimi ;

            if(yon == 2){
                yonindirimi = toplam*0.2;
                toplam = (normal - yonindirimi - yasindirimi)*2;
            }else {
                yonindirimi = 0 ;
                toplam = normal- yasindirimi;

            }


            System.out.println("ücret :" + toplam);

        }else{
            System.out.println("hatalı veri girdiniz");
        }

        

    }

}
