import java.sql.SQLOutput;
import java.util.ArrayList;

public class Soru7 {
    public static void main(String[] args){

        //Bir ArrayList<Integer> oluşturun ve içine 10 sayı ekleyin.
        //Listenin en büyük ve en küçük elemanını bulan bir Java programı yazın.

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(9);
        sayilar.add(8);
        sayilar.add(7);
        sayilar.add(6);
        sayilar.add(5);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(1);

        int max=sayilar.get(0);
        int min=sayilar.get(0);
        for (int sayi:sayilar){
            if (sayi>max){
                max=sayi;
            }
            if (sayi<min){
                min=sayi;
            }
        }
        System.out.println("En büyük sayi: "+max);
        System.out.println("En küçük sayi: "+min);


    }
}
