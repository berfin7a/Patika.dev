import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double armutk= 2.14 ,elmak=3.67,domatesk=1.11, muzk =0.95, patlıcank=5.0;
        double armut,elma,domates,muz,patlıcan;
        double armutp,elmap,domatesp,muzp,patlıcanp,sonuç;

        System.out.println("kaç kilo armut:" );
        armut = inp.nextDouble();
        System.out.println("kaç kilo elma:" );
        elma = inp.nextDouble();
        System.out.println("kaç kilo domates:" );
        domates = inp.nextDouble();
        System.out.println("kaç kilo muz:" );
        muz = inp.nextDouble();
        System.out.println("kaç kilo patlıcan:" );
        patlıcan = inp.nextDouble();

        armutp = armut*armutk;
        elmap = elma*elmak;
        domatesp = domates*domatesk;
        muzp = muz*muzk;
        patlıcanp =patlıcan*patlıcank;

        sonuç = armutp+elmap+domatesp+muzp+patlıcanp;

        System.out.println("toplam tutar:"+ sonuç);

    }
}
