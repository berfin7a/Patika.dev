package java101;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println(number);

        Scanner input = new Scanner(System.in);

        int right =0;
        int selected;
        int[] wrong = new int[5];

        boolean isWrong=false;
        boolean isWin =false;

        while(right <5){
            System.out.println("lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if(selected <0 || selected >99){
                System.out.println("lütfen 0-100 arası bir değer giriniz !");
                if(isWrong){
                    right++;
                    System.out.println("çok fazla hatalı giriş yaptınız, hakkınız : " +(5 -right));
                }else{
                    isWrong = true;
                    System.out.println("hatalı giriş yaptınız, bir sonrakinde hakkınızdan düülecektir");
                }
                continue;

            }
            if(selected == number){
                System.out.println("tebrikler, tahmininiz : " + number);
                isWin =true;
                break;
            }else{
                System.out.println("hatalı giriş yaptınız ");

                if(selected >number){
                    System.out.println("tahmininiz gizli sayıdan büyüktür");
                }else{
                    System.out.println("tahmininiz gizli sayıdan küçüktür");

                }
                wrong[right++] =selected;
                System.out.println("kalan hakkınız " +(5-right));

            }


        }
        if(!isWin){
            System.out.println("kaybbettiniz : ");
            if(!isWrong){
                System.out.println("tahminleriniz : " + Arrays.toString(wrong));
            }
        }


    }
}
