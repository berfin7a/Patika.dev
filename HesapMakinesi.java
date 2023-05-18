package java101;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz  :");
        n1 = input.nextInt();
        System.out.println("ikinci sayıyı giriniz :");
        n2 = input.nextInt();

        System.out.println("1-toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("seçiniz:");
        select = input.nextInt();

        switch(select){
            case 1:
                System.out.println("toplama :" + (n1 + n2));
                break;
             case 2:
                System.out.println("çıkartma :" +(n1 - n2));
                break;
             case 3:
                System.out.println("çarpma : "+ (n1 * n2 ));
                break;
            case 4 :
                if(n2 != 0 ) {
                    System.out.println("bölme: " + (n1 / n2));
                }else {
                        System.out.println("hatalı giriş yaptınız !");
                }

            break;

        }

    }
}
