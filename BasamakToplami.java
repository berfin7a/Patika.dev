package java101;

import java.util.Scanner;

public class BasamakToplami {

    public static void main(String[] args) {
            Scanner input =new Scanner(System.in);

            int sayi;
            System.out.println("sayı giriniz :");
            sayi = input.nextInt();

            int bsmValue,total=0;
            int tempSayi= sayi;


            while(tempSayi !=0){
                bsmValue= tempSayi%10;
                total += bsmValue;
                tempSayi /=10;
            }
            System.out.println(total);

        }
    }


