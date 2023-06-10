package java101;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.println("yıl : ");
        yil = input.nextInt();


        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.print(yil);
                System.out.println(" bir artık yıldır");
            }else{
                System.out.print(yil);
                System.out.println(" bir artık yıl değildir");
            }

        }else if (yil%4 == 0){
                System.out.print(yil);
                System.out.println(" bir artık yıldır");
         }else {
                System.out.print(yil);
                System.out.println(" bir artık yıl değildir");
            }

        }
    }
