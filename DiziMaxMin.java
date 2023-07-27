package java101;
import java.util.Scanner;
import java.util.Arrays;

public class DiziMaxMin {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("bir sayı giriniz !");
        int a = input.nextInt();

        int [] list = {15,12,788,1,-1,-778,2,0};
        int min =list[0];
        int max =list[0];
        Arrays.sort(list);

        for( int i : list){
            if(i>a){
                max =i;
                break;
            }
        }
        for(int i = list.length-1; i >= 0; --i){
            if(list[i] < a){
                min = list[i];
                break;
            }}


        System.out.println(min);
        System.out.println(max);




    }

}
