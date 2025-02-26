import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args){

        //Kullanıcıdan 10 adet sayı alıp bir ArrayList içine ekleyen ve
        //ardından bu sayıları büyükten küçüğe sıralayan bir program yazın.

        Scanner scanner=new Scanner(System.in);

        ArrayList<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            System.out.println("Sayı girin: ");
            int sayi=scanner.nextInt();
            sayilar.add(sayi);
        }
        Collections.sort(sayilar,Collections.reverseOrder());
        System.out.println("Sıralanmış sayılar: "+sayilar);

    }
}
