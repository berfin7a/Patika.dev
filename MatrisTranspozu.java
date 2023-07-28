package java101;
import java.util.Arrays;
public class MatrisTranspozu {
    public static void main(String[] args) {
        int [][] list = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println("matris : ");

        for(int[] row : list){
            for(int col : row){
                System.out.print(" "+ col + " ");
            }
            System.out.println();
        }

        System.out.println("transpoz : ");


        for( int i=0 ; i<list[0].length ;i++){
            for(int j =0;j<list.length;j++){
                System.out.print(" "+ list[j][i] + " ");

            }
            System.out.println();
        }
    }
}
