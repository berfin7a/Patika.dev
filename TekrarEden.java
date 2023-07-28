package java101;

import java.util.Arrays;

public class TekrarEden {

    public static void main(String[] args) {
        int[] list = { 1,2,3,2,4,5,4,4,5};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for(int i=0;i<list.length;i++){
            for(int j=0;j < list.length;j++){
                if((i != j) && (list[i] == list[j])){
                    if(list[i] %2 ==0){
                        System.out.println(list[i]);
                        break;
                    }
                }
            }
        }
       
        }

    }


