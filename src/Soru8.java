import java.sql.SQLOutput;
import java.util.ArrayList;

public class Soru8 {
    public static void main(String[] args){

      //Java’daki ArrayList metodlarını araştırın ve her biri için ne işe yaradığını, nasıl kullanıldığını ve örnek kod yazın:
        //	•	get()
        //	•	set()
        //	•	remove()
        //	•	clear()
        //	•	size()

        ArrayList<String> meyveler=new ArrayList<>();
        meyveler.add("Muz");
        meyveler.add("Elma");
        meyveler.add("Portakal");


        /* .get() => Bir arraylist içindeki belirli bir indeksteki elemanı getirir.*/
        System.out.println("Listedeki ilk meyve: "+meyveler.get(0));

        /* .set() => Belirtilen indeksteki elemanı günceller.*/
        System.out.println("Elma'yı mandalina ile güncelle.");
        meyveler.set(1,"Mandalina");
        System.out.println("Güncel liste: "+meyveler);

        /* .remove() => Belirtilen indeksteki elemanı listeden kaldırır.*/
        System.out.println("Portakalı listeden kaldır."+meyveler.remove(2));
        System.out.println("Güncellenmiş liste: "+meyveler);

        /* .size() => ArrayListin boyutunu gösterir.*/
        System.out.println("Listenin boyutu: "+meyveler.size());

        /* .clear() => Listeyi temizler,tüm verileri siler*/
        System.out.println("Listeyi kaldır.");
        meyveler.clear();
        System.out.println("Güncel liste: "+meyveler+" Boyutu "+meyveler.size() );
    }
}
