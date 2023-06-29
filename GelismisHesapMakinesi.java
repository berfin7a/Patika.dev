package java101;
import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int plus(int a, int b){
        int result = a + b;
        System.out.println("sonuç : " + result);
        return result;
    }
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("sonuç " + result);
        return result;
    }
    static int times( int a, int b){
        int result = a*b;
        System.out.println("sonuç " + result);
        return result;
    }
    static double divided(int a, int b){
        double result = a/b;
        System.out.println("sonuç " + result);
        return result;
    }
    static int power (int a ,int b){
        int result =1;
        for(int i =1; i<=b ;i++){
            result *=a;
        }
        System.out.println("sonuç : " +result);
        return result;

    }
    static int faktoriyel(){
        Scanner scan =new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayi = scan.nextInt();
        int result =1;
        for(int i =1;i<=sayi;i++){
            result *= i;

        }
        System.out.println("sonuç " + result);
        return result;

    }
    static int mod(int a, int b){
        int result = (a % b) ;
        System.out.println("sonuç : "+ result);
        return result;
    }
    static void area(int a ,int b){
        System.out.println("çevre : " + 2*(a+b) );
        System.out.println("alan : " + (a*b));

    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- toplama\n"
                +"2- çıkarma\n"
                +"3- çarpma\n"
                +"4- bölme\n"
                +"5- üslü sayı\n"
                +"6- faktöriyel\n"
                +"7- mod alma\n"
                +"8- dikdörtgen alan ve çevre hesabı\n"
                +"0- çıkış yap";
        System.out.println(menu);

        while(true){

            System.out.println("yapmak istediğiniz işlemi seçiniz : ");
            select = scan.nextInt();
            if(select == 0){
                break;
            }

            System.out.println("ilk sayınız :");
            int a = scan.nextInt();
            System.out.println("ikinci sayınız");
            int b = scan.nextInt();

            switch(select){
                case 1:
                    plus(a,b);
                     break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    area(a,b);
                    break;
                case 0:
                    System.out.println("iyi günler");
                    break;






                default :
                    System.out.println("yanlış seçim yaptınız.");

            }
        }



    }

}
