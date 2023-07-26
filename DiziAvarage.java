package java101;

public class DiziAvarage {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        double harmo =0.0;
        double avarage;
        for(int i=0 ; i <list.length ;i++){
            harmo += 1.0/list[i];

        }
        avarage = list.length / harmo;
        System.out.println(avarage);

    }
}
