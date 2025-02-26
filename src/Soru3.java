import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args){

        /*Bir dizide bulunan pozitif ve negatif sayıların toplamını
        ayrı ayrı hesaplayan bir Java programı yazın.*/

        Scanner scanner=new Scanner(System.in);

        int[] sayilar=new int[5];

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Sayi girin: ");
            sayilar[i]=scanner.nextInt();
        }

        int pozitifToplam=0;
        int negatifToplam=0;

        for (int sayi:sayilar) {
            if (sayi<0){
                negatifToplam+=sayi;
            }
            if (sayi>0){
                pozitifToplam+=sayi;
            }
        }

        System.out.println("Pozitif sayiların toplamı: "+ pozitifToplam);
        System.out.println("Negatif sayiların toplamı: "+negatifToplam);


    }
}
