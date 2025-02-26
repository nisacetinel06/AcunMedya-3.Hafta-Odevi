import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args){

        //Bir ArrayList<Integer> oluşturun ve içine rastgele 20 sayı ekleyin.
        //Sadece çift sayıları ayrı bir listeye ekleyin ve yazdırın.

        Random random=new Random();

        ArrayList<Integer> sayilar=new ArrayList<>();
        ArrayList<Integer> ciftSayilar=new ArrayList<>();

        for (int i = 0; i <20; i++) {
            int sayi=random.nextInt(100);
            sayilar.add(sayi);
            if (sayi%2==0){
                ciftSayilar.add(sayi);
            }
        }

        System.out.println("Random 20 sayı: "+sayilar);
        System.out.println("Çift sayılar: "+ciftSayilar);
    }
}
