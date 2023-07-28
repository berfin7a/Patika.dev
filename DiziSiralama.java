package java101;
import java.util.Scanner;
import java.util.Arrays;

public class DiziSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int boyut = 0;
        System.out.println("dizinin boyutu : ");
        boyut = input.nextInt();

        int[] list = new int[boyut];

        for( int i=0; i< boyut ;i++){
            System.out.println("dizinin " +i + ". elemanı :");
            list[i] = input.nextInt();
        }

        System.out.println("dizi : " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("sıralı : " + Arrays.toString(list));
        

    }
}
