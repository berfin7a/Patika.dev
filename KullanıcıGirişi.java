package java101;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class KullanıcıGirişi {
    public static void main(String[] args) {
        String usurName, password, yeni ;
        String cevap ;

        Scanner inp = new Scanner(System.in);

        System.out.println("kullanıcı adınız :");
        usurName = inp.nextLine();

        System.out.println("şifreniz :");
        password =inp.nextLine();

        if(usurName.equals("patika") && password.equals("java123"))
        {
            System.out.println("başarılı giriş");
        }else if (!password.equals("java123")) {
            System.out.println("hatalı şifre");

            System.out.println("şifrenizi değiştirmek istermisiniz \n evet\n hayır: ");
            cevap = inp.nextLine();

            switch (cevap){
                case "evet":
                System.out.println("yeni şifrenizi giriniz :");
                yeni = inp.nextLine();
                if(yeni.equals("java123")){
                    System.out.println("lütfen eski şifrenizden farklı şifre giriniz");
                }else{
                    System.out.println("şifreniz başarıyla oluşturuldu");
                }break;

                case "hayır":
                    System.out.println("tekrar giriş yapılıyor :");
                    break;


        }

        }



        }

    }

