package java101;
import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=1;

        for (int i =2;i<=100;i++){
            boolean asal =true;
            for(int k =2;k<i;k++){
                if(i%k ==0){
                    asal = false;
                    break;
                }
            }
            if(asal){
                System.out.println(i);
            }

        }



    }
}
