import java.util.ArrayList;
import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args){

        //Bir ArrayList<String> içerisine 5 farklı şehir ekleyin.
        //Kullanıcıdan alınan bir şehrin listede olup olmadığını bulan bir Java programı yazın.
        //Eğer şehir listede varsa, indeksini yazdırın.

        Scanner scanner=new Scanner(System.in);

        ArrayList<String> sehirler=new ArrayList<>();
        sehirler.add("Erzurum");
        sehirler.add("Hatay");
        sehirler.add("Osmaniye");
        sehirler.add("İstanbul");
        sehirler.add("Ankara");

        System.out.println("Şehir adı girin: ");
        String sehir=scanner.nextLine();

        boolean cikis= sehirler.contains(sehir);
        System.out.println("Şehir var mı? "+cikis);

        int index=sehirler.indexOf(sehir);
        System.out.println("Şehirin indexi: "+index);


    }
}
