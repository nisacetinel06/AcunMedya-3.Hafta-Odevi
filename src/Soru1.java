import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        //Kullanıcıdan 10 adet tam sayı alarak bir diziye ekleyin.
        //Dizinin ortalamasını hesaplayan ve 50’den büyük olan elemanları listeleyen bir Java programı yazın.

        Scanner scanner=new Scanner(System.in);

         int[] sayilar=new int[10];

         for (int i=0;i<sayilar.length;i++){
             System.out.println("Bir sayı girin: ");
             sayilar[i]=scanner.nextInt();
         }

        int toplam=0;
         for (int sayi:sayilar){
             toplam+=sayi;
         }

         double ortalama=(double) toplam/sayilar.length;
        System.out.println("Sayıların ortalaması: "+ortalama);

        System.out.println("50'den büyük olan sayılar: ");
         for (int sayi:sayilar){
             if (sayi>50){
                 System.out.print(sayi+" ");
             }
         }
    }
}