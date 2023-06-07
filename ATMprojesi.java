package java101;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class ATMprojesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password;
        int right =3;
        int bakiye =1500 , tutar =0;
        int select;

        while(right >0){
            System.out.println("Kullanıcı adınız :");
            userName = input.nextLine();
            System.out.println("Parolanız : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println(" Kodluyoruz bankasına hoşgeldiniz !");
                do {
                    System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" + "4-Çıkış yap");
                    System.out.println("lütfen yapmak istediğiniz işlemi seçiniz :");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("yatırmak istediğiniz tutarı giriniz :");
                            tutar = input.nextInt();
                            bakiye += tutar;
                            break;
                        case 2:
                            System.out.println("çekmek istediğiniz tutarı giriniz :");
                            tutar = input.nextInt();
                            if (bakiye < tutar) {
                                System.out.println("yetersiz bakiye");
                            } else {
                                bakiye -= tutar;
                            }
                            break;
                        case 3:
                            System.out.println("güncel bakiyeniz :" + bakiye);
                            break;
                        default:
                            System.out.println("tekrar bekleriz !");
                    }

                }while(select != 4);
                break;

            }else{
                right--;

                if(right >0){
                    System.out.println("kullanıcı adı veya parola yanlış.Tekrar deneyiniz!");
                }
                else if(right ==0){
                    System.out.println("hesabınız bloke olmuştur.Bankanız ile iletişime geçiniz.");

                }
                else{
                    System.out.println("kalan hakkınız :" + right);
                }

            }

        }

    }
}
